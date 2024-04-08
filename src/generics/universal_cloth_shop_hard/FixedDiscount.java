package generics.universal_cloth_shop_hard;

public class FixedDiscount implements Discount{
    @Override
    public double getDiscount(Clothing item) {
        return item.getPrice() - 10;
    }

    @Override
    public void getDescription() {
        System.out.println("Просто скидка в 100 тенге");
    }
}
