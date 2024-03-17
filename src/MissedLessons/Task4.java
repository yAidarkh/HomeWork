package MissedLessons;

import Collections.example_4.Manager;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Map<String,Integer> musicGroups = new HashMap<>();
        // Объявите и проиницализируйте хеш-таблицу musicGroups
        musicGroups.put("The Beatles", 1960);
        musicGroups.put("Rammstein", 1994);
        musicGroups.put("Queen", 1970);
        musicGroups.put("Led Zeppelin", 1968);
        musicGroups.put("Black Sabbath", 1968);
        musicGroups.put("AC/DC", 1973);
        musicGroups.put("The Rolling Stones", 1962);
        musicGroups.put("The Who", 1964);
        musicGroups.put("Nightwish", 1996);
        musicGroups.put("Nirvana", 1987);
        musicGroups.put("Guns N’ Roses", 1985);
        musicGroups.put("Scorpions", 1965);
        musicGroups.put("Kiss", 1973);
        musicGroups.put("The Doors", 1965);

        System.out.println("Легендарные группы, год основания которых вы можете узнать:");
        for (Map.Entry<String,Integer> entry: musicGroups.entrySet()){
            System.out.println(entry.getKey());
        }
        // Распечайте список групп
        // System.out.println(group)

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите опцию");
            System.out.println("1 - Узнать год основания группы");
            System.out.println("2 - Добавить любимую группу");
            System.out.println("3 - Выйти из приложения");
            int command = Integer.parseInt(scanner.nextLine());
            if (command == 1) {
                System.out.println("Введите название группы");
                String groupName = scanner.nextLine();
                System.out.printf("Год основания %d\n",musicGroups.get(groupName));
                // "Введите название группы"
                // keyGroup
                // year
                // "Год основания " + keyGroup
                //System.out.println(year);

            } else if (command == 2) {
                System.out.println("Введите название группы: ");
                String nameGroup = scanner.nextLine();
                System.out.println("Введите год основания: ");
                String bornYear = scanner.nextLine();
                musicGroups.put(nameGroup, Integer.parseInt(bornYear));
                // "Добавьте свою любимую группу"
                // "Введите её название"
                // nameGroup
                // "Введите год основания"
                // bornYear

                System.out.println("Информация о группе " + nameGroup + " добавлена.");

            } else if (command == 3) {
              return; // Остановите цикл
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }
}
