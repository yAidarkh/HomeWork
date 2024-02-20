package Exception;

public class Main {
    public static void main(String[] args) {
        ValidPassword validPassword = new ValidPassword();
        try {
            validPassword.validPassword("Password1");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

    }
}
