package com.sbt.jscool.homework2;

import java.util.Comparator;

public class MyStringCharComparator implements Comparator<String> {

    @Override
    public int compare(String s, String t1) {
        return s.compareTo(t1);
    }
}
