package com.sbt.jscool.homework3;

import java.util.*;

public class CollectionUtils {
    public static<T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }

    public static <T> List<T> newArrayList() {
        return new ArrayList<>();
    }

    public static <T> int indexOf(List<? extends T> source, T o) {
        return source.indexOf(o);
    }

    public static <T> List<T> limit(List<? extends T> source, int size) {
        return null;
    }

    public static <T> void add(List<? super T> source, T o) {
        source.add(o);
    }

    public static <T> void removeAll(List<? super T> removeFrom, List<? extends T> c2) {
        removeFrom.removeAll(c2);
    }

    public static<T> boolean containsAll(List<? super T> c1, List<? extends T> c2) {
        return c1.containsAll(c2);
    }

    public static<T> boolean containsAny(List<? super T> c1, List<? extends T> c2) {
        return !Collections.disjoint(c1,c2);
    }

    public static<T extends Comparable<T>> List<T> range(List<T> list, T min, T max) {
        for (var x:
             list) {
            /*if(x >= min){

            }*/
        }
        return null;
    }

    public static List range(List list, Object min, Object max, Comparator comparator) {
        return null;
    }

}

