package com.sbt.jscool.homework2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Homework2 {

    public static File file;

    public static void main(String args[]) {
        file = new File("src/com/sbt/jscool/homework2/text.txt");
        //task1();
        //task2();
        //task3();
        task4();
    }

    public static void task1(){
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        HashSet<String> s = new HashSet<String>();

        while (scanner.hasNext()){
            s.add(scanner.next());
        }
        System.out.println(s.size());
    }

    public static void task2(){
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        HashSet<String> s = new HashSet<String>();

        while (scanner.hasNext()){
            s.add(scanner.next());
        }

        ArrayList<String> al = new ArrayList<String>(s);
        Comparator<String> cmp1 = new MyStringLengthComparator().thenComparing(new MyStringCharComparator());
        al.sort(cmp1);

        for (String x:
             al) {
            System.out.println(x);
        }

    }

    public static void task3(){
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        HashMap<String, Integer> uniqueWords = new HashMap<String, Integer>();

        while(scanner.hasNext()){
            String str = scanner.next();
            if (uniqueWords.containsKey(str)){
                uniqueWords.put(str,uniqueWords.get(str) + 1);
            } else {
                uniqueWords.put(str,1);
            }
        }

        System.out.println(uniqueWords);
    }

    public static void task4(){
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ArrayList<String> al = new ArrayList<String>();

        while(scanner.hasNext()){
            al.add(scanner.next());
        }

        Collections.reverse(al);

        System.out.println(al);
    }

    public static void task5(){
        ArrayList<String> al = new ArrayList<String>();

    }
}
