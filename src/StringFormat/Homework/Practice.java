package StringFormat.Homework;

public class Practice {
    public static void main(String[] args) {
        Category[] categories = {
                new Category("Смартфоны", new Product[]{
                        new Product("Apple Iphone 12", 319_990),
                        new Product("Samsung Galaxy S23 Ultra", 619_990)
                }),
                new Category("Ноутбуки", new Product[]{
                        new Product("Apple MacBook Pro 14", 1_119_990),
                        new Product("Huawei MateBook", 419_990)
                }),
                new Category("Наушники", new Product[]{
                        new Product("Apple Airpods Max", 289_990),
                        new Product("Marshall Major IV", 89_990),
                }),
        };
        int n= 0;
        for (Category category : categories) {
            boolean firstProduct = true;
            for (Product product : category.getProducts()) {
                if (firstProduct) {
                    System.out.printf("%-30s%-30s%-7d\n", category.getName(), product.getName(), product.getPrice());
                    firstProduct = false;
                } else {
                    System.out.printf("%30s%-30s%-6d\n","",product.getName(), product.getPrice());
                }
                n += product.getPrice();
            }

        }
        System.out.printf("%-30s%-30s%-7d\n","Итого"," ",n);
    }
}
