package com.example.lian_jia.controller;

import com.example.lian_jia.entity.Orient;
import com.example.lian_jia.result.R;
import com.example.lian_jia.service.OrientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrientController {
    @Autowired
    private OrientService orientService;
    @GetMapping("/chart4")
    public R<List<Orient>> showDistrict() {
        System.out.println("orientCount房屋朝向数量统计查询");
        List<Orient> orientList = orientService.list();
        // System.out.println(districtList);
        if (orientList != null) {
            return R.success(orientList);
        } else {
            return R.error("查询失败");
        }
    }
}
