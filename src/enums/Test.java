package enums;

public class Test {
    public static void main(String[] args) {
        User user1 = new User(1,"User1");
        Product product1 = new Product(1,"Картошка",100);
        Order order1 = new Order(1,user1,product1);
        order1.displayOrderInfo();
    }
}
