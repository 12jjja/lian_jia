package com.example.lian_jia.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.lian_jia.entity.District;
import com.example.lian_jia.entity.House;
import com.example.lian_jia.result.R;
import com.example.lian_jia.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class DistrictController {

    @Autowired
    private DistrictService districtService;

    @GetMapping("/district")
    public R<List<District>> showDistrict() {
        System.out.println("district查询");
        List<District> districtList = districtService.list();
        // System.out.println(districtList);
        if (districtList != null) {
            return R.success(districtList);
        } else {
            return R.error("查询失败");
        }
    }
}
