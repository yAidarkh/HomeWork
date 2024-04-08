package generics.universal_cloth_shop_hard;

public class Main {
    public static void main(String[] args) {
        ShoppingCart<Clothing> cart = new ShoppingCart<>();

        cart.addItem(new Shirt("Белая рубашка", 29.99, "price", new FixedDiscount()));
        cart.addItem(new Pants("Синие джинсы", 49.99, "price", new BuyXGetYDiscount()));
        cart.addItem(new Jacket("Кожаная куртка", 199.99, "price", new PercentageDiscount()));

        cart.printItems();
        System.out.printf("Общая стоимость: %.2f\n", cart.calculateTotal());
    }
}
