package com.example.lian_jia.entity;

import lombok.Data;

@Data
public class StandChartsForm {
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
