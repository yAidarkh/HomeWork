package lamba.homework;

import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        //Отфильтруйте список чисел, чтобы оставить только чётные значения.
        List<Integer> someList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        UnaryOperator<List<Integer>> operator = list -> {
            List<Integer> list2 = new ArrayList<>(list);
            for (Integer i : list) {
                if (i % 2 != 0) {
                    list2.remove(i);
                }
            }
            return list2;
        };

        List<Integer> test = operator.apply(someList);
        System.out.println(test);


        //Выберите слова из списка, длина которых превышает 7 символов.
        List<String> someList2 = Arrays.asList("123", "12345678", "12345", "1234567");

        Consumer<List<String>> operator2 = list -> {
            for (String s : list) {
                if (s.length() >= 7) {
                    System.out.println(s);
                }
            }
        };

        operator2.accept(someList2);


        //Извлеките объекты из коллекции, чьи названия начинаются с определённой буквы.
        List<String> someList3 = Arrays.asList("abc", "bca", "aaa", "bbb");

        Consumer<List<String>> operator3 = list -> {
            for (String s : list) {
                if (s.trim().charAt(0) == 'a') {
                    System.out.println(s);
                }
            }
        };

        operator3.accept(someList3);


        //Преобразуйте все слова в списке в верхний регистр.
        List<String> someList4 = Arrays.asList("abc", "bca", "aaa", "bbb");

        UnaryOperator<List<String>> operator4 = list -> {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, list.get(i).toUpperCase());
            }
            return list;
        };

        operator4.apply(someList4);
        System.out.println(someList4);


        //Создайте новый список, содержащий квадраты чисел из исходного списка.
        List<Integer> someList5 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        UnaryOperator<List<Integer>> operator5 = list -> {
            List<Integer> list2 = new ArrayList<>(list);
            for (int i = 0; i < list2.size(); i++) {
                list2.set(i, list2.get(i) * 2);
            }
            return list2;
        };

        operator5.apply(someList5);
        System.out.println(someList5);


        //Преобразуйте список строк в список их длин.
        List<String> someList6 = Arrays.asList("123", "12345678", "12345", "1234567");

        UnaryOperator<List<String>> operator6 = list -> {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, String.valueOf(list.get(i).length()));
            }
            return list;
        };
        operator6.apply(someList6);
        System.out.println(someList6);


        //Найдите произведение всех чисел в списке.
        List<Integer> someList7 = Arrays.asList(1, 2, 4, 8, 123);

        Consumer<List<Integer>> operator7 = list -> {
            int sum = 1;
            for (Integer i : list) {
                sum += i;
            }
            System.out.println(sum);
        };

        operator7.accept(someList7);


        //Определите, содержит ли список хотя бы одно отрицательное число.
        List<Integer> someList8 = Arrays.asList(-1, 2, 4, 8, 123);

        Predicate<List<Integer>> operator8 = list -> {
            for (Integer i : list) {
                if (i <0){
                    return true;
                }
            }
            return false;
        };
        System.out.println(operator8.test(someList8));


        //Верните наибольшее значение из списка строк (по длине).
        List<String> someList9 = Arrays.asList("123", "12345678", "12345", "1234567");
        Function<List<String>, String> operator9 = list -> {
            String answer = "";
            for (String s : list) {
                if (s.length()>answer.length()){
                    answer = s;
                }
            }
            return answer;
        };

        System.out.println(operator9.apply(someList9));


        //Отсортируйте список строк по количеству символов в порядке возрастания, а затем переведите их все в нижний регистр.
        List<String> someList10 = Arrays.asList("ABC", "ASDASGF", "AA", "ASGDFGDFJDFH");

        UnaryOperator<List<String>> operator10 = list -> {
            Comparator<String> comparator = new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    return Integer.compare(s1.length(), s2.length());
                }
            };
            list.sort(comparator);
            for (int i = 0; i < list.size(); i++) {
                list.set(i,list.get(i).toLowerCase());
            }
            return list;
        };
        System.out.println(operator10.apply(someList10));

    }
}
