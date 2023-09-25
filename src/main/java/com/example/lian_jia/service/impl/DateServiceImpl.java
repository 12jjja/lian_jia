package com.example.lian_jia.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.lian_jia.entity.Date;
import com.example.lian_jia.mapper.DateMapper;
import com.example.lian_jia.service.DateService;
import org.springframework.stereotype.Service;

@Service
public class DateServiceImpl extends ServiceImpl<DateMapper, Date> implements DateService {
}
