package com.example.lian_jia.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.lian_jia.entity.User;
import com.example.lian_jia.result.R;
import com.example.lian_jia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import java.util.UUID;


@RestController
public class UserController {
    private String basePath = "D:\\毕业设计\\Backend\\lian_jia\\src\\main\\resources\\static\\avatar\\";
    @Autowired
    private UserService userService;

    /**
     * @param username 用户名
     * @param exPassword 前密码
     * @return 查询到的User对象
     */
    public User checkOldPassword(String username, String exPassword) {
        // 使用自定义 SQL 语句进行查询，判断旧密码是否正确
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUsername, username)
                .eq(User::getPassword, exPassword);
        return userService.getOne(queryWrapper);
    }

    /*
    修改用户信息
    因为要判断旧密码是否输入正确，所以我们需要从数据库中先获取一个对应的密码进行对比，如果不正确直接返回error
    如果正确就将新密码进行更新，然后再更新用户的简介
     */
    @PostMapping("/updateUserInfo")
    public R<String> saveAvatar(@RequestBody User user) {
        //如果user只有修改desc，则我们只根据name来修改desc不动密码
        if(user.getExPassword().equals("") || user.getPassword().equals("")){
            if(!user.getDescription().equals("")){
                userService.updateOnlyDesc(user.getUsername(),user.getDescription());
                //从数据库中取出对应username的user1判断简介是否更新成功
                User user1 = userService.getOne(new LambdaQueryWrapper<User>().eq(User::getUsername, user.getUsername()));
                if(!user1.getDescription().equals(user.getDescription())){
                    return R.error("修改简介失败");
                }else{
                    return R.success("修改简介成功");
                }
            }else{
                return R.error("请输入要修改的信息~");
            }
        }
        // 获取对应的用户进行比对旧密码,如果用户为null说明没有查询到
        User user1 = checkOldPassword(user.getUsername(), user.getExPassword());
        System.out.println("我是user1:"+user1);
        if (user1==null) {
            return R.error("旧密码错误,请重新输入");
        }
        // 更新密码和简介
        user1.setPassword(user.getPassword());
        user1.setDescription(user.getDescription());
        //提交更新
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUsername, user1.getUsername());
        boolean flag = userService.update(user1, queryWrapper);
        return flag? R.success("修改成功"):R.error("修改失败");
    }

    /*
    用户个人主页中获取用户信息展现在前端页面中
    要将数据库中avatar取出，利用IO流将文件图片转成二进制，再用Base64进行加密传输给前端
     */
    @GetMapping("/getUserInfo")
    public R<User> getUserInfo(@RequestParam String username){
        User user = userService.getOne(new LambdaQueryWrapper<User>().eq(User::getUsername, username));
        //读取 JPG 文件并转换为字节数组
        String filePath = basePath + user.getAvatar() + ".jpg";
        File file = new File(filePath);
        byte[] fileData = new byte[(int) file.length()];
        try (FileInputStream fis = new FileInputStream(file)) {
            fis.read(fileData);
        } catch (IOException e) {
            // 处理异常
            e.printStackTrace();
        }
        //将字节数组进行 Base64 编码
        String base64Data = "data:image/jpeg;base64,"+Base64.getEncoder().encodeToString(fileData);
        user.setAvatar(base64Data);
        return R.success(user);
    }

    //上传头像
    @PostMapping("/avatar")
    public R<String> uploadAvatar(@RequestBody User user) {
        // 进行上传处理
        String avatar = user.getAvatar();
        avatar = avatar.replaceAll(" ", "").substring(avatar.indexOf(",") + 1);
        byte[] decodedData = Base64.getDecoder().decode(avatar);
        FileOutputStream fos = null;
        //作为头像标识，存进数据库
        String avatarID = UUID.randomUUID().toString();
        try {
            fos = new FileOutputStream(basePath+ avatarID+".jpg");
            fos.write(decodedData);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        user.setAvatar(avatarID);
        boolean b = userService.updateOnlyAvatar(user);
        return b?R.success("上传头像成功"):R.error("上传头像失败");
    }
}
