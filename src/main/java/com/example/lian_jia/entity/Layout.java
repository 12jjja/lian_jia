package com.example.lian_jia.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@TableName("layout_count")
@Data
public class Layout implements Serializable {
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
