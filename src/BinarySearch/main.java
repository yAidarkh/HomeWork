package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
//        numbers.add(900);
//        numbers.add(800);
//        numbers.add(700);
//        numbers.add(600);
//        numbers.add(500);
//        numbers.add(400);
//        numbers.add(300);
//        numbers.add(200);
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(600);
        numbers.add(700);
        numbers.add(800);
        System.out.println(isListSorted(numbers));
        System.out.println(binarySearch(numbers, 700));
    }


    // Бинарный поиск
// O (log n)
    static int binarySearch(List<Integer> numbers, int target) {
        if (isListSorted(numbers)!=0) {
            int low = 0;
            int high = numbers.size() - 1;

            while (low <= high) {
                int mid = (high + low) / 2;
                if (numbers.get(mid) == target) {
                    return mid;
                } else if (isListSorted(numbers)==1?target > numbers.get(mid):target < numbers.get(mid)) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    static int isListSorted(List<Integer> numbers) {
        //-1 = по убыванию 1 = по возрастанию 0 = не сортирован
        if(numbers.get(0)<numbers.get(numbers.size()-1)){
            for (int i = 1; i < numbers.size(); i++) {
                if(numbers.get(i)<numbers.get(i-1)){
                    return 0;
                }
            }
            return 1;
        }else {
            for (int i = 1; i < numbers.size(); i++) {
                if(numbers.get(i)>numbers.get(i-1)){
                    return 0;
                }
            }
            return -1;
        }

    }
}
