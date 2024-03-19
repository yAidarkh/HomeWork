package Hashmap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        Map<String, List<Integer>> months = new HashMap<>();
        months.put("Январь",List.of(1,3,7,12,7));
        months.put("Февраль",List.of(1,3,7,7));
        months.put("Март",List.of(1,3,7));
        months.put("Апрель",List.of(1,3,7,12,7,6));
        months.put("Май",List.of(1,3));
        System.out.println(getMonthWithMoreHolidays(months));
    }
    static String getMonthWithMoreHolidays(Map<String,List<Integer>> s){
        String month = "";
        int maxCount = 0;
        for(Map.Entry<String,List<Integer>> entry:s.entrySet()){
            if(entry.getValue().size()>maxCount){
                maxCount=entry.getValue().size();
                month=entry.getKey();
            }
        }
        return month;
    }
}
