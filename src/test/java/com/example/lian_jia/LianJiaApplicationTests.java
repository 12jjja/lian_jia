package com.example.lian_jia;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.lian_jia.entity.Date;
import com.example.lian_jia.entity.District;
import com.example.lian_jia.entity.House;
import com.example.lian_jia.mapper.UserMapper;
import com.example.lian_jia.result.R;
import com.example.lian_jia.service.DateService;
import com.example.lian_jia.service.DistrictService;
import com.example.lian_jia.service.HouseService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class LianJiaApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private HouseService houseService;
    @Autowired
    private DistrictService districtService;
    @Autowired
    private DateService dateService;
    @Test
    void contextLoads() {
        List<Date> list = dateService.list();
        System.out.println(list);
    }

}
