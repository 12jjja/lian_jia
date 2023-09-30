package com.example.lian_jia.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.lian_jia.entity.User;
import com.example.lian_jia.mapper.UserMapper;
import com.example.lian_jia.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public void updateOnlyDesc(String description, String username) {
        baseMapper.updateOnlyDesc(username,description);
    }

    @Override
    public boolean updateOnlyAvatar(User user) {
        return baseMapper.updateOnlyAvatar(user);
    }
}
