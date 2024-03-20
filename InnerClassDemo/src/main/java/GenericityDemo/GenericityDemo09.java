package GenericityDemo;

import java.util.ArrayList;

public class GenericityDemo09 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("hello");//编译通过
        // list1.add(1);// 编译错误
        String s = list1.get(0);

        ArrayList list2 = new ArrayList<String>();
        list2.add("hello");//编译通过
        list2.add(1);//编译通过
        Object o = list2.get(0);

        new ArrayList<String>().add("hello");//编译通过
        // new ArrayList<String>().add(1);//编译错误

        String ss = new ArrayList<String>().get(0);//返回String
    }
}
