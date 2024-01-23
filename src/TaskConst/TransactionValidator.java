package TaskConst;

public class TransactionValidator {
    private static int minAmount = 100;
    private static int maxAmount = 100_000;

    static boolean isValidAmount(int transactionAmount){
        if (transactionAmount<minAmount){
            System.out.println("Минимальная сумма перевода: " + minAmount + " тг. Попробуйте ещё раз!");
            return false;
        }else if (transactionAmount>maxAmount){
            System.out.println("Максимальная сумма перевода: " + maxAmount + " тг. Попробуйте ещё раз!");
            return false;
        }
       return true;
    }

}
