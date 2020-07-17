package com.sbt.jscool.homework3;

import java.util.*;

public class CollectionUtils {
    public static <T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }

    public static <T> List<T> newArrayList() {
        return new ArrayList<>();
    }

    public static <T> int indexOf(List<? extends T> source, T o) {
        return source.indexOf(o);
    }

    public static <T> List<T>  limit(List<? extends T> source, int size) {
        List<T> list = new ArrayList<>(size);
        for (var x:
             source) {
            if (size > 0){
                list.add(x);
                size--;
            }
        }
        return list;
    }

    public static <T> void add(List<? super T> source, T o) {
        source.add(o);
    }

    public static <T> void removeAll(List<? super T> removeFrom, List<? extends T> c2) {
        removeFrom.removeAll(c2);
    }

    public static <T> boolean containsAll(List<? super T> c1, List<? extends T> c2) {
        return c1.containsAll(c2);
    }

    public static <T> boolean containsAny(List<? super T> c1, List<? extends T> c2) {
        return !Collections.disjoint(c1, c2);
    }

    public static <T extends  Comparable<? super T>> List<T> range(List<T> list, T min, T max) {
        List<T> result = new ArrayList<>();
        for (var x :
                list) {
            if((x.compareTo(min) == 1 || x.compareTo(min) == 0) && (x.compareTo(max) == -1 || x.compareTo(max) == 0)){
                result.add(x);
            }
        }
        return result;
    }

    public static<T extends Comparable<? super T>> List<T> range(List<T> list, T min, T max, Comparator<T> comparator) {
        List<T> result = new ArrayList<>();
        for (var x :
                list) {
            if((comparator.compare(x,min) == 1 || comparator.compare(x,min) == 0) && (comparator.compare(x,max) == -1 || comparator.compare(x,max) == 0)){
                result.add(x);
            }
        }
        return result;
    }

}

