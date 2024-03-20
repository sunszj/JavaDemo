package GenericityDemo;

public class GenericsDemo04 {
    public static void main(String[] args) {
        Info04 info04 = new Info04<Integer>(); // 具体类型为Integer
    }
}

class Info04<T extends Number>{ // 此处泛型只能时Number及其子类
    private T var;

    public T getVar() {
        return var;
    }

    public Info04<T> setVar(T var) {
        this.var = var;
        return this;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
