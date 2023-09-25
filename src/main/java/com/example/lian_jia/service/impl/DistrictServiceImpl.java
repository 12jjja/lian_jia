package com.example.lian_jia.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.lian_jia.entity.District;
import com.example.lian_jia.mapper.DistrictMapper;
import com.example.lian_jia.service.DistrictService;
import org.springframework.stereotype.Service;

@Service
public class DistrictServiceImpl extends ServiceImpl<DistrictMapper, District> implements DistrictService {
}
