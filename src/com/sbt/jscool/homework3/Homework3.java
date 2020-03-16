package com.sbt.jscool.homework3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Homework3 {

    public static class MyComp implements Comparator<Integer>{

        @Override
        public int compare(Integer integer, Integer t1) {
            return integer.compareTo(t1);
        }

        @Override
        public boolean equals(Object o) {
            return o.equals(this);
        }
    }

    public static void main(String[] args) {
        /*CountMap<Integer> countMap = new CountMapInt<>();
        countMap.add(10);
        countMap.add(10);
        countMap.add(5);
        countMap.add(6);
        countMap.add(5);
        countMap.add(10);
        System.out.println(countMap.getCount(5)); // 2
        System.out.println(countMap.getCount(6)); // 1
        System.out.println(countMap.getCount(10)); // 3*/

        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(4);
        numberList.add(5);
        numberList.add(6);
        numberList.add(7);
        Integer min = 3;
        Integer max = 6;


        System.out.println(CollectionUtils.range(numberList,min,max,new MyComp()));
    }
}
