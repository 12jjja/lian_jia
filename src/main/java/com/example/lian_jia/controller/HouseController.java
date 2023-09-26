package com.example.lian_jia.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.lian_jia.entity.House;
import com.example.lian_jia.entity.StandChartsForm;
import com.example.lian_jia.result.R;
import com.example.lian_jia.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HouseController {

    @Autowired
    private HouseService houseService;

    /**
     * @param pageIndex 当前页码
     * @param pageSize  展示数量
     * @param name      小区名称(模糊搜索)
     * @param district  区/县
     * @return
     */
    @GetMapping("/page")
    public R<Page<House>> page(Integer pageIndex, Integer pageSize, String name, String district) {
        System.out.printf("page查询,当前页码:%d,数量:%d,小区名称:%s,区/县:%s\n", pageIndex, pageSize, name, district);
        // 构造分页构造器对象
        Page<House> pageInfo = new Page<>(pageIndex, pageSize);
        // 条件构造器
        LambdaQueryWrapper<House> queryWrapper = new LambdaQueryWrapper<>();
        // 添加过滤条件
        queryWrapper.like(name != null, House::getCommunityName, name).
                eq(district != null, House::getDistrict, district).orderByAsc(House::getId);
        // 执行分页查询
        houseService.page(pageInfo, queryWrapper);
        return R.success(pageInfo);
    }

    @PostMapping("/update")
    public R<String> update(@RequestBody House house) {
        System.out.println("update中的house" + house);
        if (house.getId() == null) {
            return R.error("请输入正确的参数");
        }
        houseService.updateById(house);
        return R.success("修改成功");
    }

    @DeleteMapping("/delete")
    public R<String> delete(@RequestBody House house) {
        System.out.println("delete中的house" + house);
        if (house.getId() == null) {
            return R.error("删除失败");
        }
        boolean isUpdate = houseService.removeById(house);
        return isUpdate ? R.success("删除成功") : R.error("删除失败");
    }

    @GetMapping("/chart1")
    public R<List<StandChartsForm>> getCharts1() {
        List<StandChartsForm> list = houseService.listChart1();
        System.out.println(list);
        return R.success(list);
    }
    @GetMapping("/chart2")
    public R<List<StandChartsForm>> getCharts2() {
        List<StandChartsForm> list = houseService.listChart2();
        System.out.println(list);
        return R.success(list);
    }
    @GetMapping("/chart3")
    public R<List<StandChartsForm>> getCharts3() {
        List<StandChartsForm> list = houseService.listChart3();
        System.out.println(list);
        return R.success(list);
    }
    @GetMapping("/chart4")
    public R<List<StandChartsForm>> getCharts4() {
        List<StandChartsForm> list = houseService.listChart4();
        System.out.println(list);
        return R.success(list);
    }

}
