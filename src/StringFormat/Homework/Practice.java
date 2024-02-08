package StringFormat.Homework;

import HomeWork0401.Database;

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
        System.out.println("");
        String pizza = "Пицца, 1 шт., 310.50";
        String tea = "Чай, 1 шт., 113.30";
        String cookies = "Печенье, 1 шт., 75.75";
        String[] ordeers = {pizza,tea,cookies};
        double count = 0;
        for (String ordeer : ordeers) {
            int last = 0;
            for (int i = 0; i < ordeer.length(); i++) {
                if(i==ordeer.length()-1){
                    String partOrdeer = ordeer.substring(last);
                    System.out.printf("%s",partOrdeer.trim());
                    count+= Double.parseDouble(partOrdeer.trim());
                }else if (ordeer.charAt(i)==','){
                    String partOrdeer = ordeer.substring(last,i);
                    System.out.printf("%-8s",partOrdeer.trim());
                    last = i+1;
                }

            }
            System.out.println("");

        }
        System.out.printf("%-16s%.2f\n","Итого",count);
    }
}
