package com.sun.demo1;

/**
 * 接口 interface
 * 0.接口中不能有构造器
 * 1.接口中的元素都是public权限的
 * 2.接口的属性必须用 public static fianl 修饰
 * 3.可以有抽象方法，用public abstrack修饰
 * 4.可以有静态方法, 用public static修饰
 * 5.可以有默认方法, 用public default修饰
 */
public interface InterfaceMethod {
    public static final String STR = "JAVA";

    public abstract void loud();

    public static void eat(){
        System.out.println("eat");
    }

    public default void drink(){
        System.out.println("drink");
    }
}
