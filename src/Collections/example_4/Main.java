package Collections.example_4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> foodList = new ArrayList<>();
        List<Product> phoneList = new ArrayList<>();
        List<Category> categories = new ArrayList<>();
        Category foods = new Category("Еда", foodList);
        Category phones = new Category("Телефоны", phoneList);
        categories.add(foods);
        categories.add(phones);
        Manager manager = new Manager();
        manager.menu(categories);
    }
}
