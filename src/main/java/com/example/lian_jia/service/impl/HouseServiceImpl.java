package com.example.lian_jia.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.lian_jia.entity.House;
import com.example.lian_jia.entity.StandChartsForm;
import com.example.lian_jia.mapper.HouseMapper;
import com.example.lian_jia.service.HouseService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HouseServiceImpl extends ServiceImpl<HouseMapper, House> implements HouseService {

    @Override
    public List<StandChartsForm> listChart1() {
        return baseMapper.listChart1();
    }

    @Override
    public List<StandChartsForm> listChart2() {
        return baseMapper.listChart2();
    }
    @Override
    public List<StandChartsForm> listChart3() {
        return baseMapper.listChart3();
    }
    @Override
    public List<StandChartsForm> listChart4() {
        return baseMapper.listChart4();
    }


}
