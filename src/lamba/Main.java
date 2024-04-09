package lamba;

public class Main {
    public static void main(String[] args) {
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
            if (i == 0){
                stringBuilder.append(Character.toUpperCase(s.trim().charAt(0)));
            }else if(s.trim().charAt(i) == ' '){
                stringBuilder.append(Character.toUpperCase(' '));
                stringBuilder.append(Character.toUpperCase(s.trim().charAt(i+1)));
                i++;
            }else {
                stringBuilder.append(Character.toLowerCase(s.trim().charAt(i)));
            }
        }
        return stringBuilder.toString();
    };

}
