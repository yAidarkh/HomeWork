package Data.HomeWork3;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        // укажите корректный формат вывода даты
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy; HH:mm:ss. ZZZZZ");

        // создайте экземпляр ZoneId для Алматы
        ZoneId almatyZone = ZoneId.of("Asia/Almaty");
        ZonedDateTime almatyDateTime = ZonedDateTime.now(almatyZone);

        printTime(formatter, almatyDateTime, "Астана");

        convertAndPrintTime(formatter, almatyDateTime, "Осло", "Europe/Oslo");
        convertAndPrintTime(formatter, almatyDateTime, "Чикаго", "America/Chicago");
        convertAndPrintTime(formatter, almatyDateTime, "Шанхай", "Asia/Shanghai");
        convertAndPrintTime(formatter, almatyDateTime, "Аддис-Абеба", "Africa/Addis_Ababa");
    }

    private static void convertAndPrintTime(DateTimeFormatter formatter, ZonedDateTime almatyDateTime, String cityName, String region) {
        ZoneId newZone = ZoneId.of(region); // создайте ZoneId из region
        ZonedDateTime newDateTime = almatyDateTime.withZoneSameInstant(newZone); // измените временную зону у almatyDateTime

        printTime(formatter, newDateTime, cityName);
    }

    private static void printTime(DateTimeFormatter formatter, ZonedDateTime dateTime, String cityName) {
        System.out.println(cityName + ":");
        // выведите dateTime в указанном в formatter формате
        System.out.println(dateTime.format(formatter));
    }
}
