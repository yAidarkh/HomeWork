package Hashmap.Task2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Map<String, Double>> films = new HashMap<>();
        Map<String, Double> value = new HashMap<>() {{
            put("IMDb", 8.6);
            put("Kinopoisk", 8.7);
        }};
        films.put("Interstellar", value);

        value = new HashMap<>() {{
            put("IMDb", 8.8);
            put("Kinopoisk", 8.6);
        }};
        films.put("Inception", value);

        value = new HashMap<>() {{
            put("IMDb", 8.3);
            put("Kinopoisk", 8.2);
        }};
        films.put("Star Wars IV: Return of the Jedi", value);

        for (Map.Entry<String, Map<String, Double>> entry : films.entrySet()) {
            System.out.printf("""
                    Фильм: %s
                    IMDb: %.1f
                    Kinopoisk: %.1f\n
                    """, entry.getKey(), entry.getValue().get("IMDb"), entry.getValue().get("Kinopoisk"));
        }
        String maxValueIMDbName = "";
        Double maxValueIMDb = 0.0;
        String maxValueKinopoiskName = "";
        Double maxValueKinopoisk = 0.0;
        String maxDifferenceName = "";
        Double maxDifference = 0.0;

        for (Map.Entry<String, Map<String, Double>> entry : films.entrySet()) {
            double imdb = 0.0;
            double kinopoisk = 0.0;
            for (Map.Entry<String, Double> entry1 : entry.getValue().entrySet()) {
                if (entry1.getKey() == "IMDb") {
                    imdb = entry1.getValue();
                    if(entry1.getValue() > maxValueIMDb){
                    maxValueIMDbName = entry.getKey();
                    maxValueIMDb = entry1.getValue();
                    }
                } else if (entry1.getKey() == "Kinopoisk") {
                    kinopoisk = entry1.getValue();
                    if(entry1.getValue() > maxValueKinopoisk){
                    maxValueKinopoiskName = entry.getKey();
                    maxValueKinopoisk = entry1.getValue();
                    }

                }
                if (imdb!=0.0&&kinopoisk!=0.0){
                    if(Math.abs(imdb-kinopoisk)>maxDifference){
                    maxDifference = Math.abs(imdb-kinopoisk);
                    maxDifferenceName = entry.getKey();
                    }
                }
            }
        }
        System.out.printf("Самый высоко оцененный фильм в IMDb: %s (%.1f)\n", maxValueIMDbName,maxValueIMDb);
        System.out.printf("Самый высоко оцененный фильм в Kinopoisk: %s (%.1f)\n", maxValueKinopoiskName,maxValueKinopoisk);
        System.out.printf("Фильм с наивысшей разницей между оценками в IMDb и Kinopoisk: %s (%.1f)", maxDifferenceName,maxDifference);

    }
}
