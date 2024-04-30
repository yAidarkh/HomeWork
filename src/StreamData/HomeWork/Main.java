package StreamData.HomeWork;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<User> users = List.of(
                new User("Антон", 21),
                new User("Сергей", 31),
                new User("Виталий", 41),
                new User("Анатолий", 51)
        );
        FileWriter fileWriterJson = new FileWriter("src/StreamData/HomeWork/resources/users.json");
        FileWriter fileWriterCsv = new FileWriter("src/StreamData/HomeWork/resources/users.csv");

        fileWriterCsv.write("name, age\n");
        int temp = 1;
        fileWriterJson.write("[\n");
        for (User user : users) {
            FileWriter fileWriterUser = new FileWriter("src/StreamData/HomeWork/resources/user"+temp+".json");
            fileWriterUser.write("{\n   \"name\": \"%s\",\n   \"age\": %d\n}\n".formatted(user.name,user.age));
            fileWriterJson.write("{\n   \"name\": \"%s\",\n   \"age\": %d\n}".formatted(user.name,user.age));
            fileWriterJson.write(temp == users.size()? "\n":",\n");
            fileWriterCsv.write("%s, %d\n".formatted(user.name,user.age));
            fileWriterUser.close();
            temp++;
        }
        fileWriterJson.write(']');
        fileWriterJson.close();
        fileWriterCsv.close();

        // user.json
        // {"name": "User 1", "age": 29}

        // users.json
        // [{"name": "User 1", "age": 29}, {"name": "User 1", "age": 29}]

        // users.csv
        // name,age
        // User 1,29
        // User 2,30
        // User 3,31

    }
    record User(String name, int age){

    }
}
