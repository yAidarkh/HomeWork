package Data.Task_4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст с датой: ");
        String getDate = scanner.nextLine();
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        switch (getDate.toLowerCase()){
            case "сегодня":
                System.out.println("Распознанная дата: " + localDate.format(formatter));
                break;
            case "завтра":
                System.out.println("Распознанная дата: " + localDate.plusDays(1).format(formatter));
                break;
            default:
                int days = Integer.parseInt(getDate.split(" ")[1]);
                System.out.println("Распознанная дата: " + localDate.plusDays(days).format(formatter));
                break;
        }
    }
}
