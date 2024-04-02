package generics.example_3;

class Box<K, T extends Entity> {
    // Реализация класса коробки из предыдущего задания
    private K key;
    private T obj;

    public Box(K key, T obj){
        this.key = key;
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "Box{" +
                "key=" + key +
                "; keyType=" + key.getClass().getName() +
                ", obj=" + obj +
                "; objType=" + obj.getClass().getName() +
                '}';
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
