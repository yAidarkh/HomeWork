package enums;

public class Order {
    private int id;
    private User user;
    private Product product;
    private Status status;

    public void displayOrderInfo(){
        System.out.println("Заказ на пользователя: "+user.getName());
        System.out.println("Заказно: "+product.getName() + "\nСтоймостью: "+product.getPrice());
        System.out.println("Status заказа: "+status.getRusName());
    }

    public Order(int id, User user, Product product) {
        this.id = id;
        this.user = user;
        this.product = product;
        this.status = Status.CREATED;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
