package GenericityDemo;

public class GenericsDemo01 {
    public static void main(String[] args) {
        Point<String> point = new Point<>(); // 外部决定类型为String
        point.setVar("it");
        System.out.println(point.getVar().length());
    }
}
class Point<T>{           // 此处泛型标识符可以任意定义，T是type的简称
    private T var;        // var的类型由T指定，即：由外部指定

    public T getVar() {   // 返回值类型也是有外部决定
        return var;
    }

    public Point<T> setVar(T var) { // set方法的类型由外部决定
        this.var = var;
        return this;
    }
}
