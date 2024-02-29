package Collections.example_4;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private List<Product> productList = new ArrayList<>();

    public Category(List<Product> productList) {
        this.productList = productList;
    }

    public Product findMaxPriceProduct() {
        Product productWithMaxPrice = new Product("", 0);
        for (Product product : productList) {
            if (product.getPrice() > productWithMaxPrice.getPrice()) {
                productWithMaxPrice = product;
            }
        }
        return productWithMaxPrice;
    }

    public int sumPriceProducts() {
        int sum = 0;
        for (Product product : productList) {
            sum += product.getPrice();
        }
        System.out.printf("Общая цена товаров: %d\n", sum);
        return sum;
    }

    public double calculateAverage() {
        if (productList.isEmpty()) {
            return 0;
        }

        int sum = 0;
        for (Product product : productList) {
            sum += product.getPrice();
        }
        System.out.printf("Средняя цена товара: %s\n", sum / productList.size());
        return (double) sum / productList.size();
    }

    public List<Product> findProduct(String name) {
        List<Product> findedProducts = new ArrayList<>();
        for (Product product : productList) {
            if (product.getName().toLowerCase().contains(name.toLowerCase())) {
                findedProducts.add(product);
            }
        }
        return findedProducts;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }


}
