package com.sbt.jscool.homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.Buffer;
import java.util.Scanner;

public class Main {
    public static void readContent(String s) throws IOException {
        URL url;
        BufferedReader br;
        String t;
        try {
          url = new URL(s);
          br = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream()));
          while ((t = br.readLine())!=null){
              System.out.println(t);
          }
        } catch (IOException e) {
            throw new IOException();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter URL");
        while(true){
            String s = sc.nextLine();
            try {
                readContent(s);
                break;
            } catch (IOException e) {
                System.out.println("Enter another url");
            }
        }
    }
}
