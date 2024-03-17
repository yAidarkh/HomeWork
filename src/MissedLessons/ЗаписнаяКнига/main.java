package MissedLessons.ЗаписнаяКнига;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        List<String> planningTasks = new ArrayList<>();
        while (true) {
            System.out.println("""
                    Выберите действие:
                    1. Добавить задачу
                    2. Вывести список задач
                    3. Удалить задачу
                    0. Выход""");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            switch (answer) {
                case "1":
                    System.out.println("Введите задачу для планирования: ");
                    String newTask = scanner.nextLine();
                    planningTasks.add(newTask);
                    break;
                case "2":
                    int count = 1;
                    for (String s : planningTasks) {
                        System.out.printf("%d. %s\n", count, s);
                        count++;
                    }
                    break;
                case "3":
                    System.out.println("Введите номер задачи которую хотите удалить: ");
                    int index = scanner.nextInt();
                    if (index > 0 && index == planningTasks.size()) {
                        planningTasks.remove(index - 1);
                        System.out.println("Успешно удалена.");
                    } else {
                        System.out.println("Номер вне диапазона.");
                    }
                    break;
                case "0":
                    System.out.println("Вы вышли.");
                    return;
                default:
                    System.out.println("Выбранный вариант не сущетсвует.");
                    break;
            }
        }
    }
}
