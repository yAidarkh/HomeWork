package Interface;

public class Main {
    public static void main(String[] args) {
        Seagull seagull = new Seagull();
        Duck duck = new Duck();
        seagull.fly();
        seagull.swim();
        seagull.hunt();

        duck.fly();
        duck.swim();
    }
}
