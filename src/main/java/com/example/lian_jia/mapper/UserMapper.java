package com.example.lian_jia.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.lian_jia.entity.User;
import org.apache.ibatis.annotations.Update;


public interface UserMapper extends BaseMapper<User> {
    @Update("UPDATE users SET description = #{description} WHERE username = #{username}")
    void updateOnlyDesc(String description, String username);

    @Update("UPDATE users SET avatar = #{avatar} WHERE username = #{username}")
    boolean updateOnlyAvatar(User user);
}
