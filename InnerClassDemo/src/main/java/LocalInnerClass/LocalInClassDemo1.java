package LocalInnerClass;

/**
 * 局部内部类demo，局部内部类有lambda表达式有关，有助于理解lambda表达式
 */
public class LocalInClassDemo1 {

}

class OuterClass{
    public void method(){
        // 局部内部类
        class InnerClass{
            // 和普通类一样，声明变量和方法
        }
    }
    // 局部内部类有4中组合使用形式
    // 1. 提供局部内部类的实现对象
    public Comparable getInstance1(){
        // 实现接口，重新方法
        class MyComparable implements Comparable{
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }
        MyComparable myComparable = new MyComparable();
        return myComparable;
    }
    // 2.提供局部内部类的匿名对象
    public Comparable getInstance2(){
        class MyComparable implements Comparable{
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }
        return new MyComparable();
    }
    // 3.提供匿名实现类的对象
    // 这里的匿名，表示接口的实现类没有显式的类名，使用接口名称替代，实现类的对象声明也是用接口名声明
    public Comparable getInstance3(){
        // 这里的语法看似是接口的实例化，实际上是接口的实现类的实例化，并且重写了抽象方法
        Comparable comparable1 = new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
        return comparable1;
    }
    // 4.提供匿名实现类的匿名对象
    public Comparable getInstance4(){
        // 直接返回匿名实现类的匿名对象
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}
