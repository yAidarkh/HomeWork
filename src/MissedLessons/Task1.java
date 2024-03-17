package MissedLessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<String> user1 = Arrays.asList("rock", "pop", "indie");
        List<String> user2 = Arrays.asList("pop", "rock", "folk");

        // Ожидаемый результат:
        // [rock, pop]

        List<String> commonItems = getCommonItems(user1, user2);
        System.out.println(commonItems);

    }

    static List<String> getCommonItems(List<String> first, List<String> second) {
        List<String> commonItems = new ArrayList<>();
        for (String str : first) {
            if (second.contains(str)) {
                commonItems.add(str);
            }
        }
        return commonItems;
    }
}
