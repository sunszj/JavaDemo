package GenericityDemo;

public class GenericsDemo02 {
    public static void main(String[] args) {
        NotePad<String, Integer> notePad = new NotePad<>(); // 声明泛型类实例时，指定具体泛型类型
        notePad.setKey("tom");
        notePad.setVal(20);
        System.out.println(notePad.getKey());
        System.out.println(notePad.getVal());
    }
}

class NotePad<K,V>{ // 指定2个泛型类型
    private K key;  // key的类型由外部决定
    private V val;  // val的类型由外部决定

    public K getKey() {
        return key;
    }

    public NotePad<K, V> setKey(K key) {
        this.key = key;
        return this;
    }

    public V getVal() {
        return val;
    }

    public NotePad<K, V> setVal(V val) {
        this.val = val;
        return this;
    }
}
