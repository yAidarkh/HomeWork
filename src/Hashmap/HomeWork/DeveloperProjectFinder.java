package Hashmap.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> answer = new ArrayList<>();
        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            if (entry.getValue().contains(developer)) {
                answer.add(entry.getKey());
            }
        }
        return answer; //Тут надо сделать сортировку но я незнаю как!) P/s: прогуглил чет не понял.
    }
}
