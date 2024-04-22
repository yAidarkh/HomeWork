package Data.Task_3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        String str = "14 часов 09 минут. Месяц: 02, День: 14, Год: 1966.";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH часов mm минут. Месяц: MM, День: dd, Год: yyyy.");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd_MM_yyyy|HH:mm");
        LocalDateTime localDateTime = LocalDateTime.parse(str, formatter);
        System.out.println(localDateTime.format(formatter2));
    }
}
