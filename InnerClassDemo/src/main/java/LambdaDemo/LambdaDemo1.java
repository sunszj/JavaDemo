package LambdaDemo;

import java.util.Comparator;
import java.util.function.Consumer;

public class LambdaDemo1 {
    public static void main(String[] args) {
        Runnable r1 = () -> System.out.println("hello world");
        new Thread(r1).start();
        Consumer consumer = x -> System.out.println(x);
        Consumer A = (x) -> {
            // 只有一条语句时，{}可以省略
            System.out.println(x);
        };
        Comparator<Integer> comparator = (x, y) -> Integer.compare(x,y);
    }
}
