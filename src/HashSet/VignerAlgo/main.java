package HashSet.VignerAlgo;

public class main {
    public static void main(String[] args) {
        String input = "автобиография";
        String key = "скилл";
        char[] alfabet = {'а', 'б', 'в', 'г', 'д', 'е','ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < alfabet.length; j++) {
                if(input.charAt(i) == alfabet[j]){
                    result.append(alfabet[(j+new String(alfabet).indexOf(key.charAt(i%key.length())))%alfabet.length]);
                }
            }
        }
        System.out.println(result);
    }
}
