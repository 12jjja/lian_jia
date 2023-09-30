package com.example.lian_jia.entity;


import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@TableName("users")
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String username;
    private String password;
    //个人描述
    private String description;
    //头像
    private String avatar;
    private String exPassword;
    private String securityQ;
    private String securityA;

}
