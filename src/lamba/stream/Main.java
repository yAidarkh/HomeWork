package lamba.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> movies = new ArrayList<>();
        movies.add("нАчАЛО");
        movies.add("гАРРИ пОттер: узник Азкабана");
        movies.add("дюна: ЧАСТЬ два");

        List<String> movies2 = movies.stream().filter(s -> s.split(" ").length > 1).map(Main::capitalizer).toList();
        System.out.println(movies2);
    }

    static String capitalizer(String s) {
        s = s.trim();
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : s.split(" ")) {
            stringBuilder.append(string.substring(0, 1).toUpperCase()).append(string.substring(1).toLowerCase());
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }


}
