package GenericityDemo;

public class Demo1 {
    public static void main(String[] args) {
        int len = 16;
        System.out.println(Math.random());
        int rs = (int) ((Math.random() * 9 + 1) * Math.pow(10, len - 1));
        System.out.println(String.valueOf(rs));
    }
}
