package GenericityDemo;

public class GenerictyDemo05 {
    public static void main(String[] args) {
        Info05<String> i1 = new Info05<String>();
        Info05<Object> i2 = new Info05<Object>();
        i1.setVar("hello");
        i2.setVar(new Object());
        fun(i1);
        fun(i2);
    }
    public static void fun(Info05<? super String> temp){ // 只能接收String或Object类型的泛型
        System.out.println(temp);
    }
}

class Info05<T>{
    private T var;

    public T getVar() {
        return var;
    }

    public Info05<T> setVar(T var) {
        this.var = var;
        return this;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
