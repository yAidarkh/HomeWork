package enums;

import java.util.Scanner;

public class Manager {
    private Order[] orders;
    private User[] users;
    private Product[] products;

    public Manager(Order[] orders, User[] users, Product[] products) {
        this.orders = orders;
        this.users = users;
        this.products = products;
    }

    public void showStatusList(){
        int count = 1;
        for (Status s: Status.values()){
            System.out.println(count + ". " + s.getRusName());
            count++;
        }
    }

    private void addOrder(Order order){
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == null) {
                orders[i] = order;
                System.out.println("Заказ принят.");
                return;
            }
        }
        System.out.println("Заказ не принят.");

    }
    private void showUsersList(){
        int count = 1;
        for(User u:users){
            System.out.println(count +". "+u.getName());
            count++;
        }
    }
    private void showProductsList(){
        int count = 1;
        for(Product p:products){
            System.out.println(count +". "+p.getName());
            count++;
        }
    }
    private void displayAllOrders(){
        int count = 1;
        System.out.println("Заказы:");
        for (Order o: orders){
            if (o!=null){
                System.out.println(count+" - Пользователь: " + o.getUser().getName());
                System.out.println("  Товар: " + o.getProduct().getName());
                System.out.println("  Статус: "+ o.getStatus().getRusName());
                count++;
            }
        }
    }


    public void menu(){
        while (true) {
            System.out.println("1. Создать заказ." +
                    "\n2. Показать все заказы." +
                    "\n3. Изменить статус заказа." +
                    "\n4. Выйти"+
                    "\nВведите ответ: "
                    );
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            switch (answer){
                case 1:
                    showUsersList();
                    System.out.println("Введите номер пользователя: ");
                    int answerUser = scanner.nextInt();
                    showProductsList();
                    System.out.println("Введите номер товара: ");
                    int answerProduct = scanner.nextInt();
                    Order orderNew = new Order(users[answerUser-1],products[answerProduct-1]);
                    addOrder(orderNew);
                    break;
                case 2:
                    displayAllOrders();
                    break;
                case 3:
                    displayAllOrders();
                    System.out.println("Введите номер заказа:");
                    int answerOrder = scanner.nextInt();
                    showStatusList();
                    System.out.println("Введите номер статуса: ");
                    int answerStatus = scanner.nextInt();
                    orders[answerOrder-1].setStatus(Status.values()[answerStatus-1]);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Не правильно введен номер.");
            }
            if(answer==4){
                break;
            }
        }
    }
}
