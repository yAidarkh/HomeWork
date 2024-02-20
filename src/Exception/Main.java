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
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        IntegerParser integerParser = new IntegerParser();
        integerParser.parseInt(s);

    }
}
