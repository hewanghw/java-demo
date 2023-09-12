package com.hw;

import java.util.ArrayList;
import java.util.List;

public class RecursiveToTree {
    public static void main(String[] args) {
        //递归实现扁平数组转换成树型数组
        List<Building> buildingList = new ArrayList<>();
        buildingList.add(new Building("1", "万科", ""));
        buildingList.add(new Building("11", "1栋", "1"));
        buildingList.add(new Building("111", "1单元", "11"));
        buildingList.add(new Building("12", "2栋", "1"));
        buildingList.add(new Building("2", "鲁能", ""));


    }
//    public static List<Building> tranListToTreeData(List<Building> buildingList, String pid){
//        buildingList.forEach(item -> {
//
//        });
//    }
}
