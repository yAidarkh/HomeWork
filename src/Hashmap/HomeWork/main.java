package Hashmap.HomeWork;

import java.util.*;

public class main {
    public static void main(String[] args) {
        String sentence = "sentense in loWER caSE, SENTENCE IN UPper CAse.";
        WordRepetitionMapCreator wordRepetitionMapCreator = new WordRepetitionMapCreator();
        System.out.println(wordRepetitionMapCreator.createWordRepetitionMap(sentence));
        Map<Integer, String> sourceMap = new HashMap<>();
        sourceMap.put(1, "one");
        sourceMap.put(2, "two");
        sourceMap.put(3, "three");
        KeyValueSwapper keyValueSwapper = new KeyValueSwapper();
        System.out.println(keyValueSwapper.swap(sourceMap));
        List<Integer> list = List.of(-1, 5, 4, 8);
        FunctionValueFinder functionValueFinder = new FunctionValueFinder();
        System.out.println(functionValueFinder.isFunctionValuePresent(list, 27));
        Map<String, List<String>> timetable = new HashMap<>();
        timetable.put("Monday", List.of("English"));
        timetable.put("Tuesday", List.of("Mathematics"));
        timetable.put("Wednesday", List.of("English", "Chemistry"));
        timetable.put("Thursday", List.of("Literature", "Mathematics"));
        timetable.put("Friday", List.of("Physics"));
        LessonsGetter lessonsGetter = new LessonsGetter();
        System.out.println(lessonsGetter.getLessons(timetable));
        Map<String, Integer> sourceMap2 = new HashMap<>();
        sourceMap2.put("one", 1);
        sourceMap2.put("two", 2);
        sourceMap2.put("three", 3);
        sourceMap2.put("five", 5);
        sourceMap2.put("ten", 10);
        MapFromKeysCreator mapFromKeysCreator = new MapFromKeysCreator();
        System.out.println(mapFromKeysCreator.createMap(sourceMap2));
        Map<String, Set<String>> projects = new HashMap<>();
        Set<String> temp = Set.of("Ivan", "Anna", "Lidia", "Antony");
        projects.put("CSO", temp);
        temp = Set.of("Mary", "Ben", "Max");
        projects.put("VVaS", temp);
        temp = Set.of("Oleg", "Ivan", "Alex");
        projects.put("LJA", temp);
        DeveloperProjectFinder developerProjectFinder = new DeveloperProjectFinder();
        System.out.println(developerProjectFinder.findDeveloperProject(projects, "Ivan"));
    }

}
