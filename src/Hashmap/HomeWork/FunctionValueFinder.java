package Hashmap.HomeWork;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        boolean answer = functionMap.containsValue(requiredValue);
        return answer;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> functionMap = new HashMap<>();
        for (Integer i : sourceList) {
            functionMap.put(i, (5 * i + 2));
        }
        return functionMap;
    }
}
