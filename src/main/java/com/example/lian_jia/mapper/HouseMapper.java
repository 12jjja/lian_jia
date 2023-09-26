package com.example.lian_jia.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.lian_jia.entity.House;
import com.example.lian_jia.entity.StandChartsForm;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface HouseMapper extends BaseMapper<House> {

    // 第一张图:柱状图(各区/县数量前9)
    @Select("select district as name,count(*) as count from house_data group by name order by count desc limit 9;")
    List<StandChartsForm> listChart1();

    // 第二图:折线图(每个月房源上架数量)
    @Select("select substr(listing_time,1,7) as name,count(*) as count from house_data group by name order by name;")
    List<StandChartsForm> listChart2();

    // 第三张图:玫瑰图(户型数量排行)
    @Select("select layout as name, count(*) as count from house_data group by name order by count desc limit 10;")
    List<StandChartsForm> listChart3();

    // 第四张图:饼图(建筑朝向占比)
    @Select("select orientation as name,count(*) as count from house_data group by name order by count desc limit 5;")
    List<StandChartsForm> listChart4();
}
