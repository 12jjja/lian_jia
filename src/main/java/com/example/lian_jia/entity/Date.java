package com.example.lian_jia.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@TableName("date_count")
@Data
public class Date implements Serializable {
    private static final long serialVersionUID = 1L;
    private String date;
    private Integer count;

    @Override
    public String toString() {
        return "{" +
                "date:'" + date + '\'' +
                ", count:" + count +
                '}';
    }
}
