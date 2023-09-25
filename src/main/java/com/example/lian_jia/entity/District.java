package com.example.lian_jia.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@TableName("district")
@Data
public class District implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;

    @Override
    public String toString() {
        return "{" +
                "name:'" + name + '\'' +
                '}';
    }
}
