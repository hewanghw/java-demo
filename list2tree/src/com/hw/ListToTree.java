package com.hw;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class ListToTree {
    public static void main(String[] args) {
        List<Building> buildingList = new ArrayList<>();
        buildingList.add(new Building("1", "万科", ""));
        buildingList.add(new Building("11", "1栋", "1"));
        buildingList.add(new Building("111", "1单元", "11"));
        buildingList.add(new Building("12", "2栋", "1"));
        buildingList.add(new Building("2", "鲁能", ""));
        AtomicInteger i = new AtomicInteger();
        Map<String, List<Building>> map = new HashMap<>();
        buildingList.forEach(item -> {
            i.getAndIncrement();
            if(map.containsKey(item.getPid())){
                map.get(item.getPid()).add(item);
            }else {
                List<Building> valueList = new ArrayList<>();
                valueList.add(item);
                map.put(item.getPid(), valueList);
            }
        });

        buildingList.forEach(item -> {
            i.getAndIncrement();
            if(map.containsKey(item.getId())){
                item.setChildren(map.get(item.getId()));
            }
        });

        List<Building> collect = buildingList.stream().filter(item -> {
            i.getAndIncrement();
            return "".equals(item.getPid());
            }).collect(Collectors.toList());

        System.out.println(collect);
        System.out.println("执行次数: " + i);


    }
}
