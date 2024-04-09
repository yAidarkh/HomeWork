package lamba;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        UnaryOperator<List<Integer>> operator = list -> {
            for (int i = 0; i < list.size(); i++) {
                list.set(i,list.get(i)*2);
            }
            return list;
        };
        List<Integer> test = operator.apply(numbers);
        System.out.println(test);

//        Capitalazier capitalazier = new Capitalazier() {
//            @Override
//            public String capitalize(String s) {
//                StringBuilder stringBuilder = new StringBuilder();
//                for (int i = 0; i < s.trim().length(); i++) {
//                    if (i == 0){
//                    stringBuilder.append(Character.toUpperCase(s.trim().charAt(0)));
//                    }else if(s.trim().charAt(i) == ' '){
//                        stringBuilder.append(Character.toUpperCase(' '));
//                        stringBuilder.append(Character.toUpperCase(s.trim().charAt(i+1)));
//                        i++;
//                    }else {
//                        stringBuilder.append(Character.toLowerCase(s.trim().charAt(i)));
//                    }
//                }
//                return stringBuilder.toString();
//            }
//        };
        String sentence = "  hello world!  ";
        //System.out.println(capitalazier.capitalize(sentence));
        System.out.println(capitalazier.capitalize(sentence));
    }

    static Capitalazier capitalazier = s -> {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.trim().length(); i++) {
            if (i == 0) {
                stringBuilder.append(Character.toUpperCase(s.trim().charAt(0)));
            } else if (s.trim().charAt(i) == ' ') {
                stringBuilder.append(Character.toUpperCase(' '));
                stringBuilder.append(Character.toUpperCase(s.trim().charAt(i + 1)));
                i++;
            } else {
                stringBuilder.append(Character.toLowerCase(s.trim().charAt(i)));
            }
        }
        return stringBuilder.toString();
    };

}
