package com.example.lian_jia.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.lian_jia.entity.House;
import com.example.lian_jia.mapper.HouseMapper;
import com.example.lian_jia.service.HouseService;
import org.springframework.stereotype.Service;


@Service
public class HouseServiceImpl extends ServiceImpl<HouseMapper, House> implements HouseService {
}
