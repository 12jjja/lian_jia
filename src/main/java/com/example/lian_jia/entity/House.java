package com.example.lian_jia.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@TableName("house_data")
@Data
public class House implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String title;
    private String referencePrice;
    private String referencePricePerSqm;
    private String communityName;
    private String district;
    private String location;
    private String listingTime;
    private String floor;
    private String layout;
    private String totalArea;
    private String usableArea;
    private String orientation;
    private String elevatorEquipped;
    private String buildingStructure;
    private String buildingType;
    private String link;

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", referencePrice='" + referencePrice + '\'' +
                ", referencePricePerSqm='" + referencePricePerSqm + '\'' +
                ", communityName='" + communityName + '\'' +
                ", district='" + district + '\'' +
                ", location='" + location + '\'' +
                ", listingTime='" + listingTime + '\'' +
                ", floor='" + floor + '\'' +
                ", layout='" + layout + '\'' +
                ", totalArea='" + totalArea + '\'' +
                ", usableArea='" + usableArea + '\'' +
                ", orientation='" + orientation + '\'' +
                ", elevatorEquipped='" + elevatorEquipped + '\'' +
                ", buildingStructure='" + buildingStructure + '\'' +
                ", buildingType='" + buildingType + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}
