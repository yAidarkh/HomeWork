package Hashmap.HomeWork;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> answer = new HashMap<>();
        sentence = sentence.replaceAll("[.,]", "");
        sentence = sentence.toLowerCase();
        int last = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ' || i == sentence.length() - 1) {
                i = (i == sentence.length() - 1) ? i + 1 : i;
                String word = sentence.substring(last, i);
                if (!answer.containsKey(word)) {
                    answer.put(word, 1);
                } else {
                    answer.put(word, answer.get(word) + 1);
                }
                last = i + 1;

            }
        }
        return answer;
    }
}
