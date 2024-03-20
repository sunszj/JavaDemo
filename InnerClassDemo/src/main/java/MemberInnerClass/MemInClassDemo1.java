package MemberInnerClass;

/**
 * 成员内部类demo
 */
public class MemInClassDemo1 {
    public static void main(String[] args) {
        // 调用static member inner class
        // 注意：指定内部类的类型时，一定要包含外部类名
        // 静态与外部类对象无关，所以直接调用静态成员内部类的构造器
        Person.Cat cat = new Person.Cat();
        cat.loud();
        // 非静态与对象有关，所以使用外部内的对象，调用非静态成员内部类的构造器
        Person person = new Person();
        Person.Dog dog = person.new Dog();
        dog.loud();
    }
}

class Person{
    // 先声明外部类，在声明成员内部类
    // 静态成员内部类
    static class Cat{
        public void loud(){
            System.out.println("喵喵喵");
        }
    }
    // 非静态成员内部类
    class Dog{
        public void loud(){
            System.out.println("汪汪汪");
        }
    }
}
