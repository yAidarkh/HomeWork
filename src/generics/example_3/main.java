package generics.example_3;

public class main {
    public static void main(String a[]) {
        Box<String, Banana> bananaBox = new Box<>("banana", new Banana());
        bananaBox.getObj().printClass();

        Box<String, Apple> appleBox = new Box<>("apple", new Apple());
        appleBox.getObj().printClass();

        Box<String, Fruit> fruitBox = new Box<>("fruit", new Fruit());
        fruitBox.getObj().printClass();

        Box<String, Cabbage> cabbageBox = new Box<>("cabbage", new Cabbage());
        cabbageBox.getObj().printClass();

        Box<String, Vegetable> vegetableBox = new Box<>("vegetable", new Cabbage());
        vegetableBox.getObj().printClass();
    }
}
