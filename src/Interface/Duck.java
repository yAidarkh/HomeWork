package Interface;

public class Duck implements Flyable, Waterfowl {
    @Override
    public void fly() {
        System.out.println("Лечу над камышами!");
    }

    @Override
    public void land() {

    }

    @Override
    public void swim() {
        System.out.println("Плаваю в пруду!");
    }
}
