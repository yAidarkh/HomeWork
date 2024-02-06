package StringTask;

public class Valid {
    public boolean validPassword(String password) {
        if(password.length()>=8){
            for (int i = 0; i<password.length();i++){
                if(Character.isUpperCase(password.charAt(i))){
                    for (int j = 0; j<password.length();j++){
                        if(Character.isDigit(password.charAt(j))){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    public boolean validMail(String email){
        int count = 0;
        for (int i = 0; i<email.length();i++){
            if(email.charAt(i)==' '){
                return false;
            }else if(email.charAt(i)=='@'){
                count++;
            }
        }
        if(count==1){
            return true;
        }
        return false;
    }
}
