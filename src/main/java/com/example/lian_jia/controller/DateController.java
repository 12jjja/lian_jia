package com.example.lian_jia.controller;

import com.example.lian_jia.entity.Date;
import com.example.lian_jia.result.R;
import com.example.lian_jia.service.DateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DateController {
    @Autowired
    private DateService dateService;

    @GetMapping("/chart2")
    public R<List<Date>> getCharts2() {
        List<Date> list = dateService.list();
        return R.success(list);
    }
}
