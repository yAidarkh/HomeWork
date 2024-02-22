package ExceptionHomeWork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();

        User user = getUserByLoginAndPassword(login,password);

        validateUser(user);

        System.out.println("Доступ предоставлен");
    }
    public static User[] getUsers() {
        User user1 = new User("jhon", "pass", "jhon@gmail.com", 24);
        User user2 = new User("josh","pass1","josh@gmail.com",17);
        User user3 = new User("josh2","pass2","josh2@gmail.com",18);
        User user4 = new User("josh3","pass3","josh3@gmail.com",20);
        User user5 = new User("josh4","pass4","josh4@gmail.com",21);
        return new User[]{user1, user2,user3,user4,user5};
    }
    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if(user.getLogin().equals(login)&&user.getPassword().equals(password)){
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }
    public static void validateUser(User user) throws AccessDeniedException{
        if(user.getAge()<18){
            throw new AccessDeniedException("Вам нет 18.");
        }
    }
}
