package com.example.lian_jia.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.lian_jia.entity.User;
import com.example.lian_jia.mapper.UserMapper;
import com.example.lian_jia.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
