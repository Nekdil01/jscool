package com.sbt.jscool.homework3;

import java.util.HashMap;
import java.util.Map;

public class CountMapInt<T> implements CountMap<T> {

    private Map<T,Integer> map;

    public CountMapInt() {
        map = new HashMap<>();
    }

    @Override
    public void add(T o) {
        if (map.containsKey(o)){
            map.put(o,map.get(o) + 1);
        } else {
            map.put(o,1);
        }
    }

    @Override
    public int getCount(T o) {
        return map.get(o);
    }

    @Override
    public int remove(T o) {
        return map.remove(o);
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public void addAll(CountMap<T> source) {
        map.putAll(source.toMap());
    }

    @Override
    public Map<T,Integer> toMap() {
        return map;
    }

    @Override
    public void toMap(Map<T,Integer> destination) {
        destination = map;
    }
}
