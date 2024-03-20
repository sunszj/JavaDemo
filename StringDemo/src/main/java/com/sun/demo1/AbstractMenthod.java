package com.sun.demo1;

/**
 * 抽象类的定义 abstract
 * 1.抽象类中可以像普通方法一样，定义属性，构造器，方法
 * 2.抽象类中不一定有抽象方法，但有抽象方法的类，一定是抽象类或接口
 * 3.抽象方法只有方法签名，没有方法体
 * 4.抽象方法不能是private,static, fianl, fianal
 */
public abstract class AbstractMenthod {
    private String stri;

    public AbstractMenthod() {
    }

    public AbstractMenthod(String stri) {
        this.stri = stri;
    }

    public abstract void loud();
}
