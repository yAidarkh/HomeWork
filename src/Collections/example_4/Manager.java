package Collections.example_4;

import java.util.List;
import java.util.Scanner;

public class Manager {
    public void menu(List<Category> categoryList) {
        while (true) {
            int index = 1;
            System.out.println("Категории товаров: ");
            for (Category category : categoryList) {
                System.out.printf("%d. %s\n", index, category.getName());
                index += 1;
            }
            System.out.print("Выберите категорию: ");
            Scanner scanner = new Scanner(System.in);
            String answerString = scanner.nextLine();
            if (answerString.isBlank()) {
                System.out.println("Вы не выбрали категорию.");
                break;
            } else if (Integer.parseInt(answerString) < 1 || Integer.parseInt(answerString) > categoryList.size()) {
                System.out.println("Такой категории нету.");
                break;
            } else {
                System.out.print("Напишите название нового продукта: ");
                String newProductName = scanner.nextLine();
                if (newProductName.isBlank()) {
                    System.out.println("Название пустое.");
                    break;
                }
                System.out.print("Напишите цену нового продукта: ");
                int newProductPrice = Integer.parseInt(scanner.nextLine());
                if (newProductPrice < 0) {
                    System.out.println("Цена меньше нуля.");
                    break;
                }
                Product newProduct = new Product(newProductName, newProductPrice, categoryList.get(Integer.parseInt(answerString) - 1));
                categoryList.get(Integer.parseInt(answerString) - 1).getProductList().add(newProduct);
                System.out.printf("Продукт %s ценой %d добавлен в категорию %s", newProduct.getName(), newProduct.getPrice(), categoryList.get(Integer.parseInt(answerString) - 1).getName());
                break;
            }

        }
    }
}
