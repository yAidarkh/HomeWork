package Collections.example_4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> foodList = new ArrayList<>();
        List<Product> phoneList = new ArrayList<>();
        Category foods = new Category(foodList);
        Category phones = new Category(phoneList);
        foodList.add(new Product("Хлеб", 150));
        foodList.add(new Product("Молоко", 500));
        foodList.add(new Product("Курица", 1000));
        foodList.add(new Product("Говядина", 1500));
        phoneList.add(new Product("Xiaomi", 100_000));
        phoneList.add(new Product("Samsung", 150_000));
        phoneList.add(new Product("Iphone", 200_000));
        phoneList.add(new Product("Nokia", 15_000));
        System.out.println(foods.findMaxPriceProduct());
        foods.sumPriceProducts();
        foods.calculateAverage();
        System.out.println(phones.findMaxPriceProduct());
        phones.sumPriceProducts();
        phones.calculateAverage();
    }
}
