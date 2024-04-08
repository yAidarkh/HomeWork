package generics.universal_cloth_shop;

public abstract class Clothing {
    String name;
    double price;

    public Clothing(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "%s (%.2f)".formatted(name,price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}