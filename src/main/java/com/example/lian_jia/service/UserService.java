package com.example.lian_jia.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.lian_jia.entity.User;

public interface UserService extends IService<User> {

    void updateOnlyDesc( String username,String description);

    boolean updateOnlyAvatar(User user);
}
