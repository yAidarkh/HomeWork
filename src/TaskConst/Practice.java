package TaskConst;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите сумму перевода в тенге.");
        int transactionAmount = scanner.nextInt();

        boolean isValid = TransactionValidator.isValidAmount(transactionAmount);
        if (isValid){
            System.out.println("Спасибо! Ваш перевод на сумму " + transactionAmount + " тг. успешно выполнен.");
    }
}
}
