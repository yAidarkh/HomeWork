package Data;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
//        LocalTime time1 = LocalTime.of(20, 38);
//        LocalTime time2 = LocalTime.of(20, 38);
//
////                     time1 < time2
//        System.out.println(time1.isBefore(time2));
//
////                     time1 > time2
//        System.out.println(time1.isAfter(time2));
//
////                     time1 == time2
//        System.out.println(time1.equals(time2));
//
//        LocalTime now = LocalTime.now();
//        LocalTime someTime = LocalTime.of(23, 30);
//
//        Duration duration = Duration.between(now, someTime);
//        System.out.printf("Промежуток %d час %d минут %d секунд\n",
//                duration.toHoursPart(), duration.toMinutesPart(), duration.toSecondsPart());
//
//
//        Month month = Month.MARCH;
//        String monthName = month.getDisplayName(TextStyle.FULL, Locale.of("ru"));
//        LocalDate date1 = LocalDate.of(2024, month, 14);
//        System.out.println(date1);
//
//
//        LocalDate today = LocalDate.now();
//        LocalDate date = LocalDate.of(2023, 7, 6);
//
//        System.out.printf("Сегодня %d %s\n", today.getDayOfMonth(), today.getMonth().getDisplayName(TextStyle.FULL, Locale.of("ru")));
//
//        Period period = Period.between(today, date);
//        long days = ChronoUnit.DAYS.between(today, date);
//
//        System.out.println(days);
//
//        LocalDate today = LocalDate.now();
//
//        // Предположим, что у вас есть переменная с датой рождения
//        LocalDate birthday = LocalDate.of(1990, 4, 15);
//
//        // Устанавливаем год рождения равным текущему году
//        birthday = birthday.withYear(today.getYear());
//
//        // Проверяем, если день рождения уже прошел в этом году, то считаем для следующего года
//        if (birthday.isBefore(today) || birthday.isEqual(today)) {
//            birthday = birthday.plusYears(1);
//        }
//
//        // Вычисляем период между сегодняшним днем и днем рождения
//        Period period = Period.between(today, birthday);
//
//        // Выводим количество дней до дня рождения
//        System.out.println("До дня рождения осталось " + period.getDays() + " дней");

//        LocalDate now = LocalDate.now();
//        LocalDate birthday = LocalDate.of(2024,4,17);
//        System.out.println("До дня рождения осталось " +
//                ((birthday.isAfter(now) || birthday.isEqual(now))?
//                        ChronoUnit.DAYS.between(now,birthday) :
//                        ChronoUnit.DAYS.between(now,birthday.plusYears(1))
//                + " дней."));
//        System.out.println(now);
        LocalDate today = LocalDate.now();
        LocalDate date = LocalDate.of(2023, 7, 6);

        System.out.printf("Сегодня %d %s\n", today.getDayOfMonth(), today.getMonth().getDisplayName(TextStyle.FULL, Locale.of("ru")));
    }
}
