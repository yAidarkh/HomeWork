package MissedLessons;

import Collections.example_4.Manager;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> currencyRate = new HashMap<>();
        currencyRate.put("USD", 448.58);
        currencyRate.put("EUR", 488.55);
        currencyRate.put("AED", 122.15);
        System.out.println("Введите сумму в тенге: ");
        String answerSum = scanner.nextLine();
        for (Map.Entry<String, Double> entry : currencyRate.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("Выберите валюту: ");
        String answerCurr = scanner.nextLine();
        Double finalAnswer = Double.valueOf(answerSum)/currencyRate.get(answerCurr);
        System.out.printf("%s тг в %s составляет: %.2f\n",answerSum, answerCurr, finalAnswer);
    }
}
