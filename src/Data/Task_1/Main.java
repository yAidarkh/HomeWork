package Data.Task_1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату: ");
        String dataString = scanner.nextLine();
        List<Integer> dataIntList = Arrays.stream(dataString.split(" ")).map(Integer::parseInt).toList();
        LocalDate today = LocalDate.now();
        LocalDate getedDateFromUser = LocalDate.of(dataIntList.get(0), dataIntList.get(1), dataIntList.get(2));
        System.out.println(getedDateFromUser.isAfter(today)? "Это будущее":"Это прошлое");
    }
}
