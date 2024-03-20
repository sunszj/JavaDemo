package com.sun.stringdemo;

public class demo {
    public static void main(String[] args) {
        System.out.println("hello world");
        test(1,2,3,4,6);
    }

    public static void test(int... ints){
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
