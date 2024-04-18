package Data.Task_2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2024, 4, 16, 8, 30);
        for (int i = 0; i < 6; i++) {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm");
            System.out.print(start.format(dateTimeFormatter));
            start = start.plusHours(5);
            System.out.println(" - " + start.format(dateTimeFormatter));
        }
    }
}
