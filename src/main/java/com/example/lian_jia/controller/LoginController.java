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
        System.out.println(user);
        //判断user数据是否存在
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUsername,user.getUsername());
        queryWrapper.eq(User::getPassword,user.getPassword());
        User IsUser = userService.getOne(queryWrapper);
        System.out.println(IsUser);
        if(IsUser == null) {
            //如果用户查询为空，直接创建一个新的用户
            boolean isCreate = userService.save(user);
            return isCreate? R.success("登录成功"):R.success("登录失败");
        }else{
            return R.success("登录成功");
        }
    }
}
