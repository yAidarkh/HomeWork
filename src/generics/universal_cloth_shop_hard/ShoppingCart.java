package generics.universal_cloth_shop_hard;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart <T extends Clothing>{
    private List<T> basket = new ArrayList<>();

    public void addItem(T item){
        basket.add(item);
    }

    public void removeItem(T item){
        basket.remove(item);
    }

    public double calculateTotal(){
        double sum = 0.0;
        for (T t : basket) {
            sum += t.getDiscount().getDiscount(t);;
        }
        return sum;
    }

    public void printItems(){
        System.out.println("Товары в корзине:");
        for (T t : basket) {
            System.out.println("- "+t.toString());
        }
    }
}
