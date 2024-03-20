package MemberInnerClass;

public class MemInClassDemo2 {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        Person1.Cat cat = person1.new Cat();
        cat.loud();
        cat.showCat("ccc");
        cat.showCat2();
    }
}

class Person1{
    String name = "白鹭";
    int age = 1;

    // 非静态成员内部类，调用外部类的结构
    // 同名时，调用用外部类属性名：OuterClassName.this.attrName，否则采取就近原则
    // 同名时，调用外部类方法：OuterClassName.this.methodName
    class Cat{
        String name = "黄鹂";
        public void loud(){
            System.out.println("mmm");
        }
        public void showCat(String name){
            // 调用当前内部类属性
            System.out.println("age="+age);
            // 形参
            System.out.println("name=" + name);
            // 成员变量
            System.out.println("name=" + this.name);
            // 调用用外部类属性
            System.out.println("name=" + Person1.this.name);
        }
        public void showCat2(){
            // 调用当前内部类的方法
            loud();
            this.loud();
            // 调用外部类的方法
            Person1.this.loud();
        }
    }

    public void loud(){
        System.out.println("ppp");
    }

}
