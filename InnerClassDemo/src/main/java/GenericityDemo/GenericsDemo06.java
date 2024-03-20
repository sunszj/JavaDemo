package GenericityDemo;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo06 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("hello");
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        System.out.println(list1.getClass() == list2.getClass());
    }
}
