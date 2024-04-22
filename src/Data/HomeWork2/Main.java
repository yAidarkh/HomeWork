package Data.HomeWork2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatterForStartTime = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Введите дни работы (пн, вт, ср, ... вс):");
        String workDays = scanner.nextLine();
        System.out.println("Введите время начало работы (HH:mm):");
        String startTime = scanner.nextLine();
        LocalTime startTimeFormatter = LocalTime.parse(startTime, formatterForStartTime);
        System.out.println("Введите время окончание работы (HH:mm):");
        String finishTime = scanner.nextLine();
        LocalTime finishTimeFormatter = LocalTime.parse(finishTime, formatterForStartTime);
        String[] workDaysArray = workDays.split(", ");
        int totalWorkDaysPerYear = 52 * workDaysArray.length;
        int totalWorkHoursPerDay = (int) (ChronoUnit.HOURS.between(startTimeFormatter, finishTimeFormatter) - 1);
        System.out.printf("Общее количество рабочих часов за год: %d\n", totalWorkHoursPerDay * totalWorkDaysPerYear);

    }
}
