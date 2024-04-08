package generics.universal_cloth_shop_hard;

public class PercentageDiscount implements Discount{
    @Override
    public double getDiscount(Clothing item) {
        return item.getPrice() * 0.9;
    }

    @Override
    public void getDescription() {
        System.out.println("Просто скидка в 10%");
    }
}
