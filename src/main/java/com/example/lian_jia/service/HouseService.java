package com.example.lian_jia.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.lian_jia.entity.House;
import com.example.lian_jia.entity.StandChartsForm;

import java.util.List;

public interface HouseService extends IService<House> {

    List<StandChartsForm> listChart3();

    List<StandChartsForm> listChart1();

    List<StandChartsForm> listChart2();

    List<StandChartsForm> listChart4();
}
