package Hashmap.HomeWork;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> answer = new HashSet<>();
        for (Map.Entry<String, List<String>> entry : timetable.entrySet()) {
            for (String s : entry.getValue()) {
                answer.add(s);
            }
        }
        return answer;
    }
}
