package Collections.example_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    Выберите действие:
                    1. Добавить задачу
                    2. Вывести список задач
                    3. Удалить задачу
                    0. Выход""");
            int answer = scanner.nextInt();
            switch (answer) {
                case 1:
                    System.out.println("Введите задачу для планирования: ");
                    String newTask = scanner.next();
                    tasks.add(newTask);
                    break;
                case 2:
                    System.out.println("Список запланированных дел: ");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.printf("%d. %s.\n", i + 1, tasks.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Введите идекс задачи для удаления: ");
                    int indexForDelete = scanner.nextInt();
                    if (indexForDelete > 0 && indexForDelete <= tasks.size()) {
                        String removedTask = tasks.remove(indexForDelete - 1);
                        System.out.printf("Задача: \"%s\" удалена.", removedTask);
                        break;
                    }
                    System.out.println("Задача не найдена.");
                    break;
                case 0:
                    return;
            }

        }
    }
}
