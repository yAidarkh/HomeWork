package Data.HomeWork;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Util {
    private List<Friend> friends;

    public void menu() {
        while (true) {
            System.out.println("""
                    1. Добавить друга
                    2. Узнать сколько дней осталось до дня рождения
                    3. Вывод всех друзей
                    0. Выйти""");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Выберите действие: ");
            int getDesicion = Integer.parseInt(scanner.nextLine());
            switch (getDesicion) {
                case 1:
                    addFriend(getName(), getBirthday());
                    break;
                case 2:
                    getDaysForBirthday(getName());
                    break;
                case 3:
                    showAllFriend();
                    break;
                case 0:
                    System.out.println("Вы вышли.");
                    return;
                default:
                    System.out.println("Такого вариант нету.");
                    break;
            }

        }
    }

    protected void showAllFriend() {
        System.out.println("Ваши друзья: ");
        for (Friend friend : friends) {
            System.out.println(friend);
        }
    }

    protected void getDaysForBirthday(String name) {
        for (Friend friend : getFriends()) {
            if (friend.getName().toLowerCase().equals(name.toLowerCase())) {
                LocalDate now = LocalDate.now();
                LocalDate birthday = friend.getBirthday().withYear(now.getYear());
                System.out.println("До дня рождения " + friend.getName() + " осталось " +
                        ((birthday.isAfter(now) || birthday.isEqual(now)) ?
                                ChronoUnit.DAYS.between(now, birthday) :
                                ChronoUnit.DAYS.between(now, birthday.plusYears(1)))
                                        + " дней. Исполниться: " +
                                        ((birthday.isAfter(now) || birthday.isEqual(now)) ? now.getYear() - friend.getBirthday().getYear() :
                                                now.getYear() - friend.getBirthday().getYear() + 1 ));
            }else {
                System.out.println("Друг не найден.");
            }
        }
    }

    protected String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }

    protected LocalDate getBirthday() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день рождение (год месяц день): ");
        String birthday = scanner.nextLine();
        List<Integer> date = Arrays.stream(birthday.split(" ")).map(Integer::parseInt).toList();
        return LocalDate.of(date.get(0), date.get(1), date.get(2));
    }

    protected void addFriend(String name, LocalDate birthday) {
        getFriends().add(new Friend(name, birthday));
        System.out.println("Друг успешно добавлен.");
    }

    public Util(List<Friend> friend) {
        this.friends = friend;
    }

    public List<Friend> getFriends() {
        return friends;
    }

    public void setFriends(List<Friend> friend) {
        this.friends = friend;
    }
}
