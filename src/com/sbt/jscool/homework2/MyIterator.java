package com.sbt.jscool.homework2;

import java.util.ArrayList;
import java.util.Iterator;

public class MyIterator implements Iterator<String> {

    private ArrayList<String> list;
    private Integer curindex;

    public MyIterator(ArrayList<String> l){
        list = l;
        curindex = l.size()-1;
    }

    @Override
    public boolean hasNext() {
        return curindex >= 0;
    }

    @Override
    public String next() {
        return null;
    }
}
