package enums;

public class Test {
    static User[] users = {
            new User(9991, "John"),
            new User(9992, "Will"),
            new User(9993, "Dylan"),
            new User(9994, "Matt"),
    };

    static Product[] products = {
            new Product(1111, "Marshall IV Major", 179),
            new Product(1112, "Iphone XR", 269),
            new Product(1113, "MacBook Pro", 1219),
            new Product(1114, "Nike Air Mag", 199990),
    };

    static Order[] orders = new Order[10];
    public static void main(String[] args) {
        Manager manager = new Manager(orders,users,products);
        manager.menu();
    }
}
