package BigDecimal;

import java.math.BigDecimal;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal a = BigDecimal.valueOf(scanner.nextInt());
        BigDecimal b = BigDecimal.valueOf(scanner.nextInt());

        System.out.println("Сложение: "+ a.add(b));
        System.out.println("Вычитание: "+ BigDecimal.valueOf(Integer.max(a.intValue(),b.intValue())).subtract(BigDecimal.valueOf(Integer.min(a.intValue(),b.intValue()))));
        System.out.println("Умножение: "+ a.multiply(b));
        System.out.println("Деление: "+ BigDecimal.valueOf(Integer.max(a.intValue(),b.intValue())).divide(BigDecimal.valueOf(Integer.min(a.intValue(),b.intValue()))));
    }
}
