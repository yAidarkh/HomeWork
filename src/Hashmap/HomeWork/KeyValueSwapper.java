package Hashmap.HomeWork;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> answer = new HashMap<>();
        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            answer.put(entry.getValue(), entry.getKey());
        }
        return answer;
    }
}
