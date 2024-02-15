package equals;

public class Practice {
    public static void main(String[] args) {
        Car car1 = new Car("1","1");
        Car car2 = new Car("1","2");

        System.out.println(car1.equals(car2));
        System.out.println(car1.toString());
        System.out.println(car2.toString());
    }
}
