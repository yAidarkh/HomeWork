package Exception;

public class Main {
    public static void main(String[] args) {
        ValidPassword validPassword = new ValidPassword();
        try {
            validPassword.validPassword("Password");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

    }
}
