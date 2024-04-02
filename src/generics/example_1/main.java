package generics.example_1;

public class main {
    public static void main(String[] args) {
        // параметризируем класс типом String
        Box<String> sample1 = new Box<>("Runtime");
        System.out.println(sample1);
        // параметризируем класс типом Integer
        Box<Integer> sample2 = new Box<>(1);
        System.out.println(sample2);
        // параметризируем класс типом Boolean
        Box<Boolean> sample3 = new Box<>(Boolean.TRUE);
        System.out.println(sample3);
    }
}
