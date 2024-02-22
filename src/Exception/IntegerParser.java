package Exception;


public class IntegerParser{
    public int parseInt(String s){
        if (s.isBlank()) {
            throw new EmptyStringException("Введена пустая строка.");
        }else if(!isDigitString(s)){
            throw new StringNotNumberException("Вы ввели не целое число.");
        }else if (isToSmallNumber(s)){
            throw new StringIsTooSmallNumberException("Введённое число слишком маленькое.");
        }else if (s.length()>10){
            throw new StringIsTooBigNumberException("Введённое число слишком большое.");
        }
        Integer a = Integer.parseInt(s);
        return a;
    }
    public double parseDouble(String s){
        if (s.isBlank()) {
            throw new EmptyStringException("Введена пустая строка.");
        }else if(!isDoubleString(s)){
            throw new StringNotNumberException("Вы ввели не целое число.");
        }else if (isToSmallDouble(s)){
            throw new StringIsTooSmallNumberException("Введённое число слишком маленькое.");
        }else if (s.length()>Double.MAX_VALUE){
            throw new StringIsTooBigNumberException("Введённое число слишком большое.");
        }
        Double a = Double.parseDouble(s);
        return a;
    }

    static boolean isDoubleString(String s){
        int pointCount=0;
        if(!(Character.isDigit(s.charAt(0)))||s.charAt(0)=='-') {
            return false;
        }
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i)=='.'){
                pointCount+=1;
            }else if(!Character.isDigit(s.charAt(i))){
                return false;
            }
        }
        if (pointCount>1){
            return false;
        }
        return true;
    }
    static boolean isToSmallDouble(String s){
        if(s.charAt(0)=='-'&&s.length()>Double.MAX_VALUE){
            return true;
        }
        return false;
    }

    static boolean isToSmallNumber(String s){
        if(s.charAt(0)=='-'&&s.length()>11){
            return true;
        }
        return false;
    }

    static boolean isDigitString(String s){
        if(!(Character.isDigit(s.charAt(0)))||s.charAt(0)!='-') {
            return false;
        }
        for (int i = 1; i < s.length(); i++) {
            if(!Character.isDigit(s.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public class EmptyStringException extends RuntimeException{
        public EmptyStringException(String message){
            super(message);
        }
    }
    public class StringNotNumberException extends RuntimeException{
        public StringNotNumberException(String message){
            super(message);
        }
    }
    public class StringIsTooBigNumberException extends RuntimeException{
        public StringIsTooBigNumberException(String message){
            super(message);
        }
    }
    public class StringIsTooSmallNumberException extends RuntimeException{
        public StringIsTooSmallNumberException(String message){
            super(message);
        }
    }
}
