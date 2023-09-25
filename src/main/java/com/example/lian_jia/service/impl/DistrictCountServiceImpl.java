package com.example.lian_jia.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.lian_jia.entity.DistrictCount;
import com.example.lian_jia.mapper.DistrictCountMapper;
import com.example.lian_jia.service.DistrictCountService;
import org.springframework.stereotype.Service;

@Service
public class DistrictCountServiceImpl extends ServiceImpl<DistrictCountMapper, DistrictCount> implements DistrictCountService {
}
