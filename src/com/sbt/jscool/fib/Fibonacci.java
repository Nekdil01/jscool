package com.sbt.jscool.fib;

import java.util.Scanner;

public class Fibonacci implements Runnable {
    private int cur;
    public int answer;


    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            Fibonacci fib = new Fibonacci(n);
            Thread fibThread = new Thread(fib);
            fibThread.start();
            fibThread.join();
            System.out.println(fib.answer);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public Fibonacci(int cur) {
        this.cur = cur;
    }

    @Override
    public void run() {
        if (cur <= 2)
            answer = 1;
        else {
            try{
                Fibonacci f1 = new Fibonacci(cur-1);
                Fibonacci f2 = new Fibonacci(cur-2);
            Thread f1Thread = new Thread(f1);
            Thread f2Thread = new Thread(f2);
            f1Thread.start();
            f2Thread.start();
            f1Thread.join();
            f2Thread.join();
            answer = f1.answer+f2.answer;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
