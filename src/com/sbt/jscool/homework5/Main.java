package com.sbt.jscool.homework5;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        FromClass fromClass = new FromClass(21, "Nikita");
        ToClass toClass = new ToClass();

        BeanUtils.assign(toClass,fromClass);

        System.out.println(toClass.toString());
    }



}
