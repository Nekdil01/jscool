package com.sbt.jscool.homework3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Homework3 {

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

        List<Number> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(4);

        //CollectionUtils.removeAll(numberList,integerList);
        System.out.println(CollectionUtils.containsAny(numberList,integerList));

    }
}
