package Hashmap.HomeWork;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> answer = new HashMap<>();
        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            if (!answer.containsKey(entry.getKey().length())) {
                Set<String> temp = new HashSet<>();
                temp.add(entry.getKey());
                answer.put(entry.getKey().length(), temp);
            } else {
                Set<String> temp = new HashSet<>();
                temp = answer.get(entry.getKey().length());
                temp.add(entry.getKey());
                answer.put(entry.getKey().length(), temp);
            }
        }
        return answer;
    }
}
