package Collections.example_4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Хлеб", 150));
        products.add(new Product("Молоко", 500));
        products.add(new Product("Курица", 1000));
        products.add(new Product("Говядина", 1500));

        int sumProductPrice = 0;
        int maxProductPrice = 0;
        for (Product product:products){
            System.out.println(product);
            if (product.getPrice()>maxProductPrice){
                maxProductPrice=product.getPrice();
            }
            sumProductPrice+=product.getPrice();
        }
        System.out.printf("Средняя цена на товары %s\n",sumProductPrice/products.size());
        System.out.printf("Максимальная цена товара %d\n",maxProductPrice);

    }
}
