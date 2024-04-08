package generics.universal_cloth_shop_hard;

public class BuyXGetYDiscount implements Discount{
    @Override
    public double getDiscount(Clothing item) {
        if (item instanceof Jacket){
            return item.getPrice() - 20;
        } else if (item instanceof Pants) {
            return item.getPrice() - 5;
        } else if (item instanceof Shirt) {
            return item.getPrice() - 10;
        }else{
            return item.getPrice();
        }
    }

    @Override
    public void getDescription() {
        System.out.println("Разная скидкак для разных товаров");
    }
}
