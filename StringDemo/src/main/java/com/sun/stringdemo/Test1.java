package com.sun.stringdemo;

import jdk.jfr.Unsigned;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.validator.PublicClassValidator;

import java.math.BigDecimal;
import java.security.Signature;

public class Test1 {
    @Test
    public void test1(){
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "Hello";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println("--------------");

        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println("==============");

        System.out.println(s1.startsWith("he"));
        System.out.println(s1.startsWith("ll"));
        System.out.println("-------------");
    }

    @Test
    public void test2(){
        String s = "hello";

        System.out.println(s.length());
        System.out.println("------------------");

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println("-----------");

        System.out.println(s.indexOf("l"));
        System.out.println(s.indexOf("owx"));
        System.out.println("-------------- ");

        System.out.println(s.substring(1));
        System.out.println(s.substring(1, 2));
        System.out.println(s.substring(0, s.length()));
        System.out.println(s.substring(0, 10));
        System.out.println("--------");
    }

    @Test
    public void test3(){
        String s = "abcde";

        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            System.out.println(aChar);
        }

        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println("-----------");
    }

    @Test
    public void test4(){
        String a = "1234";
        System.out.println(String.format("%-20s%-10s",a, "hello"));
        System.out.println(String.format("%3.3s000", "1"));
    }

    @Test
    public void test5(){
         String s = "10";
         int n = Integer.parseInt(s, 16);
        System.out.println(n);
    }

    @Test
    public void test6(){
        Integer n = 256;
        String s;
        int i = 3 % -2;
        System.out.println(i);
    }

    @Test
    public void test7(){
        int i = 1;
        System.out.println(4 >>> 2);
    }

    @Test
    public void test8(){
        System.out.println(5 / 20); // 0 除法的两个运算数都是整数是，结果只保留整数部分，丢弃小数部分
        System.out.println(5.0 / 20); // 0.25 有一个或两个浮点数时，才会保留小数
        System.out.println(5 / 20.0);// 0.25
        System.out.println(5.0 / 20.0); // 0.25
        System.out.println(12 % 9); // 求模的两个运算数只能是整数，运算的结果由第一个运算数的正负决定
        System.out.println(12 % -9);// 3
        System.out.println(-12 % 9);// -3
        System.out.println(-12 % -9);// -3
        // System.out.println(String.format("%013.02lf", 12.32));
        System.out.println(String.format("%013.02f", 12.234));
        System.out.println(String.format("%5d", 12));
    }

    @Test
    public void test9(){
        char a = 'a';
        char b = 'b';
        System.out.println(a + b);
        int x = 0b11; // 二进制数0b11赋值给变量x
        System.out.println(x);
        int y = 0123; // 八进制数0123赋值给变量y
        System.out.println(y);
        int z = 0x123; // 十六进制数0x123赋值给变量z
        System.out.println(z);
        boolean fag1 = true;
        boolean fag2 = true;
        System.out.println(fag1 != fag2);
    }

    @Test
    public void test10(){
        BigDecimal a = new BigDecimal("100");
        BigDecimal b = new BigDecimal("-2.00");
        System.out.println(a.multiply(b).toString());
        System.out.println(String.format("%013.2f", 500.00).replace(".",""));
    }

    @Test
    public void test11(){
        String s = "123";
        String s1 = StringUtils.isBlank(s) ? "false" : "true";
        System.out.println(StringUtils.leftPad(s, 32, "0"));

    }
}
