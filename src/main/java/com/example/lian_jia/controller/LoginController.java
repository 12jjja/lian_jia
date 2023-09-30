package com.example.lian_jia.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.lian_jia.entity.User;
import com.example.lian_jia.result.R;
import com.example.lian_jia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public R<String> login(@RequestBody User user){
        //判断user数据是否存在
        User IsUser = getOneUser(user,"login");
        System.out.println(IsUser);
        if(IsUser == null) {
            //如果用户查询为空，返回错误
            return R.error("用户名或密码错误，请重新输入");
        }else{
            return R.success("登录成功");
        }
    }

    @PostMapping("/register")
    public R<String> register(@RequestBody User user){
        //判断user数据是否存在
        User IsUser = getOneUser(user,"register");
        System.out.println(IsUser);
        if(IsUser == null) {
            //如果用户查询为空，直接创建一个新的用户
            boolean isCreate = userService.save(user);
            return isCreate? R.success("注册成功"):R.success("注册失败");
        }else{
            return R.error("用户名已存在，请重新注册");
        }
    }

    public User getOneUser(User user,String type){
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUsername,user.getUsername());
        if(type.equals("login")){
            queryWrapper.eq(User::getPassword,user.getPassword());
        }
        return userService.getOne(queryWrapper);
    }

    @PostMapping("/isExistUser")
    public R<User> isExistUser(@RequestBody User user){
        //判断user数据是否存在
        User IsUser = getOneUser(user,"");
        System.out.println(IsUser);
        if(IsUser == null) {
            //如果用户查询为空，返回error
            return R.error("查找用户失败,请确认用户名~");
        }else{
            //如果用户没有设置密保，返回失败，无法找回密码
            if(IsUser.getSecurityQ()==null){
                return R.error("您没有设置密保，请重新创建用户~");
            }
            return R.success(IsUser);
        }
    }

    @PostMapping("/changePassword")
    public R<String> changePassword(@RequestBody User user){
        //因为在check表单中已经验证过了用户是存在的，在这里只需要更改密码就可以
        User IsUser = getOneUser(user,"");
        IsUser.setPassword(user.getPassword());
        boolean isUpdate = userService.update(IsUser, new LambdaQueryWrapper<User>().eq(User::getUsername, IsUser.getUsername()));
        return isUpdate? R.success("修改密码成功"):R.error("修改密码失败");
    }
}
