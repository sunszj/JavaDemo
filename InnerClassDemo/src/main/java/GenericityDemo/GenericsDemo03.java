package GenericityDemo;

public class GenericsDemo03 {
    public static void main(String[] args) {
        Info<String> info = new InfoImpl<String>("tom");// 父类声明子类对象，指定泛型的具体类型
        System.out.println(info.getVar());
    }
}

interface Info<T>{
    T getVar();
}
class InfoImpl<T> implements Info<T>{
    private T var;

    public InfoImpl(T var) {
        this.var = var;
    }

    public InfoImpl<T> setVar(T var) {
        this.var = var;
        return this;
    }

    @Override
    public T getVar() {
        return this.var;
    }
}
