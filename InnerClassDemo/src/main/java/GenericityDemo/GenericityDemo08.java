package GenericityDemo;

public class GenericityDemo08 {
    public static void main(String[] args) {
        // 不指定泛型类型
        int i = GenericityDemo08.add(1,2); // 两个都是Integer，所以T是Integer
        Number f = GenericityDemo08.add(1,1.2);// 两个参数一个是Integer，一个是Float，所以取同一父类的最小级，为Number
        Object o = GenericityDemo08.add(1, "add");// 两个参数一个是Integer,一个是String，所以取同一父类的最小级，为Object。
        // 不指定泛型
        int a = GenericityDemo08.<Integer>add(1,2);//不报错，指定T为Integer，参数类型只能为Integer类型或者其子类
        // int b = GenericityDemo08.<Integer>add(1,2.2);// 编译报错，指定了T为Integer，参数类型不能为Float。
        Number c = GenericityDemo08.<Number>add(1, 2.2);//不报错，指定为Number，所以参数类型可以为Integer,Float。
    }

    public static <T> T add(T x, T y){
        return y;
    }
}
