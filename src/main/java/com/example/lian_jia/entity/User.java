package com.example.lian_jia.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@TableName("Users")
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String username;
    private String password;
}
