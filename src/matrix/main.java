package matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>() {{
            add(new User("John", 29));
            add(new User("Amy", 32));
            add(new User("Jane", 28));
            add(new User("Jack", 28));
            add(new User("Peter", 28));
            add(new User("Steve", 28));
        }};
        Random random = new Random();
        List<List<User>> pairs = new ArrayList<>();
        while (!users.isEmpty()) {
            int randomIndex = random.nextInt(users.size());
            User tempUser = users.remove(randomIndex);
            if (!users.isEmpty()) {
                int randomIndex2 = random.nextInt(users.size());
                User tempUser2 = users.remove(randomIndex2);
                List<User> pair = Arrays.asList(tempUser, tempUser2);
                pairs.add(pair);
            } else {
                List<User> singlePair = List.of(tempUser);
                pairs.add(singlePair);
            }
        }
        for (List<User> pair : pairs) {
            System.out.println(pair);
        }
    }


    record User(String name, int age) {
    }
}
