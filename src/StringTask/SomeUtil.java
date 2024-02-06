package StringTask;

import java.util.Arrays;

public class SomeUtil {
    public void countConsonantsChar(String words) {
        char[] vowels = {'а', 'о', 'и', 'е', 'ё', 'э', 'ы', 'у', 'ю', 'я'};
        int last = 0;
        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i) == ','||i==words.length()-1) {
                i = (i == words.length() - 1) ? i + 1 : i;
                String word = words.substring(last, i);
                System.out.print(word + " - ");
                int count = 0;
                for (int j = 0; j < word.length(); j++) {
                    for (char c : vowels) {
                        if (c == word.charAt(j)) {
                            count++;
                        }
                    }
                }
                System.out.print((word.length() - count) + "\n");
                last = i + 1;
            }
        }
    }



    public void printListFromString(String list) {
        int last = 0;
        int count = 1;
        for (int i = 0; i < list.length(); i++) {
            if (list.charAt(i) == '-'||i==list.length()-1) {
                i = (i == list.length() - 1) ? i + 1 : i;
                String word = list.substring(last, i);
                System.out.println(count + ". " + word);
                count++;
                last = i+1;

            }
        }
    }
    public int countWordInString(String sentence){
        int count = 0;
        sentence = sentence.trim();
        for (int i = 0; i<sentence.length();i++){
            if(sentence.charAt(i)==' '){
                count++;
            }
        }
        return count+1;
    }
    public String findLongestWord(String sentence){
        String answer="";
        int last=0;
        for (int i =0;i<sentence.length();i++){
            if(sentence.charAt(i)==' '||i==sentence.length()-1){
                i = (i == sentence.length() - 1) ? i + 1 : i;
                String word = sentence.substring(last,i);
                if(word.length()>answer.length()){
                    answer=word;
                }
                last=i+1;
            }
        }
        return answer;
    }
    public void countAllChar(String sentence) {

        char[] listOfChar = new char[36];
        for (int i = 0; i < sentence.length(); i++) {
            int count = 0;
            if (!isInArray(listOfChar, sentence.charAt(i))) {
                for (int j = 0; j < sentence.length(); j++) {
                    if (sentence.charAt(i) == sentence.charAt(j)) {
                        count++;
                    }
                }
                System.out.println(sentence.charAt(i) + " - " + count);
                addToArrays(listOfChar, sentence.charAt(i));
            }
        }
    }
    public void sentenceToSnakeSentence(String sentence){
        sentence=sentence.trim();
        String result = "";
        for (int i =0; i<sentence.length();i++){
            if (Character.isUpperCase(sentence.charAt(i))){
                result+= Character.toLowerCase(sentence.charAt(i));
            } else if (Character.isLowerCase(sentence.charAt(i))) {
                result+= Character.toUpperCase(sentence.charAt(i));
            } else if (sentence.charAt(i)==' ') {
                result+= "_";
            }
        }
        System.out.println(result);
    }
    protected void addToArrays(char[] array,char c){
        for (int i =0;i<array.length;i++){
            if('\u0000' == array[i]){
                array[i]=c;
                break;
            }
        }
    }
    protected boolean isInArray(char[] array,char c){
        for(char n:array){
            if(n==c){
                return true;
            }
        }
        return false;
    }
}
