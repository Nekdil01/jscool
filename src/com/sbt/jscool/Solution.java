package com.sbt.jscool;

import com.sbt.jscool.homework.Homework;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        int d = length / 3 + ((length % 3) > 1 ? 1 : 0);

        System.out.println(d / 12 + " " + d % 12);
    }
}
