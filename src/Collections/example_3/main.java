package Collections.example_3;


import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1. Ввести числа вручную
                2. Сгенерировать случайные числа.""");
        System.out.print("Ввыберите вариант (1 или 2):  ");
        String answerString = scanner.nextLine();
        switch (Integer.parseInt(answerString)) {
            case 1:
                manager.simpleNumbers();
                break;
            case 2:
                manager.randomNumbers();
                break;
        }
    }
}
