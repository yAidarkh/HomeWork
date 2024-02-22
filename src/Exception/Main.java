package Exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ValidPassword validPassword = new ValidPassword();
//        try {
//            validPassword.validPassword("Password1");
//        }catch (RuntimeException e){
//            System.out.println(e.getMessage());
//        }
//        System.out.print("Введите целое число => ");
//        Scanner scanner = new Scanner(System.in);
//        final String inputValue = scanner.next();
//        IntegerParser integerParser = new IntegerParser();
//        final int parsedValue = integerParser.parseInt(inputValue);
//        System.out.println(parsedValue);

        System.out.print("Введите double число => ");
        Scanner scanner = new Scanner(System.in);
        final String inputValue = scanner.next();
        IntegerParser integerParser = new IntegerParser();
        final double parsedValue = integerParser.parseDouble(inputValue);
        System.out.println(parsedValue);

    }
}
