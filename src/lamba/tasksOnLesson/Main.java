package lamba.tasksOnLesson;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(null, -1));
        users.add(new User("null", 0));
        users.add(new User("user1", 23));
        users.add(new User("user2", 100000));
        users.add(new User("user3", -1));

        User user1 = new User("asd", 5);

        Predicate<User> validateUser = Main::validateUser;
        System.out.println(validateUser.test(user1));

        UnaryOperator<List<User>> validateListOfUsers = Main::validateListOfUsers;
        List<User> validatedUsers = validateListOfUsers.apply(users);
        System.out.println(validatedUsers);
    }

    static boolean validateUser(User user) {
        if (!user.name.isBlank() && user.age > 0) {
            return true;
        }
        return false;
    }

    static List<User> validateListOfUsers(List<User> list) {
        List<User> answerList = new ArrayList<>();
        for (User user : list) {
            if (null != user.name && user.age > 0) {
                if (!user.name.isBlank()){
                    answerList.add(user);
                }
            }
        }
        return answerList;
    }

    static class User {
        String name;
        int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Имя: " + name + ". Возраст: " + age;
        }
    }
}
