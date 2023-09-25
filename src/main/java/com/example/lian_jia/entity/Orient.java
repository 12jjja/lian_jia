package com.example.lian_jia.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("Orient")
@Data
public class Orient {
    private static final long serialVersionUID = 1L;
    private String name;
    private Integer count;

    @Override
    public String toString() {
        return "{" +
                "name:'" + name + '\'' +
                ", count:" + count +
                '}';
    }
}
