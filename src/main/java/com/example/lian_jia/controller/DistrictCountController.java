package com.example.lian_jia.controller;

import com.example.lian_jia.entity.DistrictCount;
import com.example.lian_jia.result.R;
import com.example.lian_jia.service.DistrictCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DistrictCountController {
    @Autowired
    private DistrictCountService districtCountService;

    @GetMapping("/chart1")
    public R<List<DistrictCount>> getCharts1() {
        List<DistrictCount> list = districtCountService.list();
        return R.success(list);
    }

}
