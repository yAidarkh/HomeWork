package Exception;

public class ValidPassword {
    public void validPassword(String password) throws RuntimeException {
        if(password.length()>=8){
            for (int i = 0; i<password.length();i++){
                if(Character.isUpperCase(password.charAt(i))){
                    for (int j = 0; j<password.length();j++){
                        if(Character.isDigit(password.charAt(j))){
                            System.out.println("Пароль подходит.");
                        }
                    }
                }
            }
        }else {
        throw new RuntimeException("Пароль не подходит.");}
    }
}
