package com.sbt.jscool.homework2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Homework2 {

    public static File file;

    public static void main(String[] args) {
        file = new File("src/com/sbt/jscool/homework2/text.txt");
        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
        task6();
    }

    public static void task1() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        HashSet<String> s = new HashSet<>();

        while (scanner.hasNext()) {
            s.add(scanner.next());
        }
        System.out.println(s.size());
    }

    public static void task2() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        HashSet<String> s = new HashSet<>();

        while (scanner.hasNext()) {
            s.add(scanner.next());
        }

        ArrayList<String> al = new ArrayList<>(s);
        Comparator<String> cmp1 = new MyStringLengthComparator().thenComparing(new MyStringCharComparator());
        al.sort(cmp1);

        for (String x :
                al) {
            System.out.println(x);
        }

    }

    public static void task3() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        HashMap<String, Integer> uniqueWords = new HashMap<>();

        while (scanner.hasNext()) {
            String str = scanner.next();
            if (uniqueWords.containsKey(str)) {
                uniqueWords.put(str, uniqueWords.get(str) + 1);
            } else {
                uniqueWords.put(str, 1);
            }
        }

        System.out.println(uniqueWords);
    }

    public static void task4() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ArrayList<String> al = new ArrayList<>();

        while (scanner.hasNext()) {
            al.add(scanner.next());
        }

        Collections.reverse(al);

        System.out.println(al);
    }

    public static void task5() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ArrayList<String> al = new ArrayList<>() {
            @Override
            public Iterator<String> iterator() {
                return new Iterator<>() {
                    private int curIndex = size() - 1;

                    @Override
                    public boolean hasNext() {
                        return curIndex >= 0;
                    }

                    @Override
                    public String next() {
                        if (curIndex < 0) {
                            throw new NoSuchElementException();
                        } else {
                            return get(curIndex--);
                        }
                    }
                };
            }
        };

        while (scanner.hasNext()) {
            al.add(scanner.next());
        }

        for (var x : al) {
            System.out.println(x);
        }

    }

    public static void task6(){
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ArrayList<String> al = new ArrayList<>();

        while (scanner.hasNext()) {
            al.add(scanner.next());
        }
        scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до " + al.size() + ", или -1 чтобы выйти");
        while (true){
            if (scanner.hasNextInt()){
                int t = scanner.nextInt();
                if ((t > al.size() || t < 0) && t != -1){
                    System.out.println("Вне границ");
                } else if (t == -1){
                    System.out.println("ВЫХОД");
                    break;
                } else if (t > 0){
                    System.out.println(al.get(t-1));
                }
            } else {
                System.out.println("Неверный ввод!");
            }
        }
    }
}
