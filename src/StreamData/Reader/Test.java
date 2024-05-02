package StreamData.Reader;

import enums.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {
        List<Product> products = new ArrayList<>();
        Reader reader = new FileReader("src/StreamData/Reader/recources/products.csv");
        BufferedReader br = new BufferedReader(reader);
        br.readLine();
        while (br.ready()) {
            String[] temp2 = br.readLine().split(",");
            int id = Integer.parseInt(temp2[0]);
            String name = temp2[1];
            int price = Integer.parseInt(temp2[2]);
            Product product = new Product(id, name, price);
            products.add(product);
        }
        reader.close();

        products.sort((p1, p2) -> p1.price - p2.price);
        System.out.println("Самый дешевый продукт: ");
        System.out.println(products.get(0));
        System.out.println("Самый дорогой продукт: ");
        System.out.println(products.get(products.size() - 1));
    }

    record Product(int id, String name, int price) {
        @Override
        public String toString() {
            return "Id: %d\nName: %s\nPrice: %d".formatted(id, name, price);
        }
    }
}
