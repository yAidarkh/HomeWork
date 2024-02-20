package Exception;


public class IntegerParser{
    public int parseInt(String s){
        if (s.equals("")){
            throw new EmptyStringException("Введена пустая строка.");
        }else if (s.length()>10){
            throw new StringIsTooBigNumberException("Введённое число слишком большое.");

        }

        Integer a = Integer.parseInt(s);
        return a;

//        try {
//
//        }catch (NullPointerException | EmptyStringException e){
//            System.out.println("Введена пустая строка.");
//        }catch (StringNotNumberException e){
//            System.out.println("Вы ввели не целое число.");
//        }catch (StringIsTooBigNumberException e){
//            System.out.println("Введённое число слишком большое.");
//        }catch (StringIsTooSmallNumberException e){
//            System.out.println("Введённое число слишком маленькое.");
//        }
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
