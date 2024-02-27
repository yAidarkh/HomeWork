package Collections.example_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Выберите действие:\n"+
            "1. Добавить задачу\n"+
            "2. Вывести список задач\n"+
            "3. Удалить задачу\n"+
            "0. Выход");
            int answer = scanner.nextInt();
            switch (answer){
                case 1:
                    System.out.println("Введите задачу для планирования: ");
                    String newTask = scanner.next();
                    tasks.add(newTask);
                    break;
                case 2:
                    System.out.println("Список запланированных дел: ");
                    for (int i = 0; i < tasks.size(); i++) {
                        if(tasks.get(i)!=null) {
                            System.out.printf("%d. %s.\n", i + 1, tasks.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.println("Введите идекс задачи для удаления: ");
                    int indexForDelete = scanner.nextInt();
                    System.out.printf("Задача: \"%s\" удалена.",tasks.remove(indexForDelete-1));

            }
            if (answer==0){
                break;
            }
        }
    }
}
