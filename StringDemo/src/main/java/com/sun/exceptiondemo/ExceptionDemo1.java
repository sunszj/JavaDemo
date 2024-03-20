package com.sun.exceptiondemo;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        // test1();
        test2();
        System.out.println("main");
    }

    private static void test2(){
        int i = 0;
        if (i==0) {
            throw new NumberFormatException("my exception");
        }
        System.out.println("1");
    }
    private static void test1() {
        String str = "abc";
        try {
            int i = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (Exception e){
            // System.out.println(e.getMessage());
        } finally {
            System.out.println("over");
        }
        System.out.println("go");
    }
}
