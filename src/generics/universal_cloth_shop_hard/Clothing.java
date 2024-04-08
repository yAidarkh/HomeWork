package generics.universal_cloth_shop_hard;

import java.util.List;

public abstract class Clothing implements Comparable<generics.universal_cloth_shop.Clothing> {
    private String name;
    private double price;
    private String comparableField;
    private Discount discount;

    public Clothing(String name, double price, String comparableField, Discount discount) {
        this.name = name;
        this.price = price;
        this.comparableField = comparableField;
        this.discount = discount;
    }

    public String getComparableField() {
        return comparableField;
    }

    public void setComparableField(String comparableField) {
        this.comparableField = comparableField;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscountList(Discount discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "%s (%.2f)".formatted(name, price);
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

    @Override
    public int compareTo(generics.universal_cloth_shop.Clothing other) {
        switch (comparableField) {
            case "price":
                return Double.compare(this.price, other.getPrice());
            case "name":
                return this.name.compareTo(other.getName());
            default:
                return 0;
        }
    }
}
