package Collections.example_4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> foodList = new ArrayList<>();
        List<Product> phoneList = new ArrayList<>();
        List<Category> categories = new ArrayList<>();
        Category foods = new Category(foodList);
        Category phones = new Category(phoneList);
        categories.add(foods);
        categories.add(phones);
        foodList.add(new Product("Apple", 150));
        foodList.add(new Product("Молоко", 500));
        foodList.add(new Product("Курица", 1000));
        foodList.add(new Product("Говядина", 1500));
        phoneList.add(new Product("Xiaomi", 100_000));
        phoneList.add(new Product("Samsung", 150_000));
        phoneList.add(new Product("Apple Iphone", 200_000));
        phoneList.add(new Product("Nokia", 15_000));

        ArrayList<Product> findedProductsList = new ArrayList<>();
        for (Category category : categories) {
            System.out.println(category.findMaxPriceProduct());
            category.sumPriceProducts();
            category.calculateAverage();
            category.findProduct("APPLE", findedProductsList);
        }
        System.out.println(findedProductsList);
    }
}
