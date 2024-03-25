package HashSet.CesatrAlgo;

public class main {
    public static void main(String[] args) {
        String input = "скилл";
        int rot = 20;
        char[] alfabet = {'а', 'б', 'в', 'г', 'д', 'е', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я', 'ё'};
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < alfabet.length; j++) {
                if(input.charAt(i) == alfabet[j]){
                    result.append(alfabet[(j+rot)%alfabet.length]);
                }
            }
        }
        System.out.println(result);

    }
}
