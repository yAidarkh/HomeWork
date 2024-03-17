package MissedLessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = List.of(3, 4, 5, 6, 7);
        System.out.println(getUnCommonItems(list1,list2));
        System.out.println(getUnCommonItems2(list1,list2));
    }
    static List<Integer> getUnCommonItems(List<Integer> list1, List<Integer> list2){
        List<Integer> unCommonItems = new ArrayList<>();
        for (int i: list1){
            if(!list2.contains(i)){
                unCommonItems.add(i);
            }
        }
        for (int i: list2){
            if(!list1.contains(i)){
                unCommonItems.add(i);
            }
        }
        return unCommonItems;
    }
    static List<Integer> getUnCommonItems2(List<Integer> list1, List<Integer> list2) {
        List<Integer> unCommonItems = new ArrayList<>(list1);
        unCommonItems.removeAll(list2);
        List<Integer> temp = new ArrayList<>(list2);
        temp.removeAll(list1);
        unCommonItems.addAll(temp);
        return unCommonItems;
    }
}
