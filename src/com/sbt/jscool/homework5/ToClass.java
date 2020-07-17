package com.sbt.jscool.homework5;

class ToClass {
    int age;
    String name;

    public ToClass(){

    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ToClass{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
