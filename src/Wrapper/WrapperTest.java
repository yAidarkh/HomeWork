package Wrapper;

public class WrapperTest {
    static Product[] products = {
            new Product("Iphone 12", 289990),
            new Product("Iphone 13", 319990),
            new Product("Iphone 14", 399990),
            new Product("Iphone 15", 521990),
    };


    // TODO: Реализовать метод для отображение товаров, с возможностью ставить фильтры от и до
    static void filter(Integer from, Integer to) {
        for(Product p:products){
            if(from==null&&to!=null){
                if(p.getPrice()<to){
                    System.out.println(p.getName());
                }
            }else if (to == null&&from!=null){
                if(p.getPrice()>from){
                    System.out.println(p.getName());
                }
            }else if (from == null&&to ==null){
                System.out.println(p.getName());
            }else {
                if (p.getPrice() > from && p.getPrice() < to) {
                    System.out.println(p.getName());
                }
            }
        }
    }


    public static void main(String[] args) {
        filter(null,null);
    }
}


class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}