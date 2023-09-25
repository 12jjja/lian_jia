package com.example.lian_jia.controller;

import com.example.lian_jia.entity.Layout;
import com.example.lian_jia.result.R;
import com.example.lian_jia.service.LayoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LayoutController {

    @Autowired
    private LayoutService layoutService;

    @GetMapping("/chart3")
    public R<List<Layout>> getCharts3() {
        List<Layout> list = layoutService.list();
        return R.success(list);
    }
}
