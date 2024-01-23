package enums;

public class Order {

    private User user;
    private Product product;
    private Status status;

    public void displayOrderInfo(){
        System.out.println("Заказ на пользователя: "+user.getName());
        System.out.println("Заказно: "+product.getName() + "\nСтоймостью: "+product.getPrice());
        System.out.println("Status заказа: "+status.getRusName());
    }

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
        this.status = Status.CREATED;
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
