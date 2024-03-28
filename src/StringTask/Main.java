package StringTask;

public class Main {
    public static void main(String[] args) {
        Valid valid = new Valid();
        System.out.println(valid.validPassword("Erbol1"));
        System.out.println(valid.validMail("erbola@gmail.com"));
        String words = "Понедельник,Вторник,Среда,Четверг,Пятница,Суббота,Воскресенье";
        SomeUtil someUtil = new SomeUtil();
        someUtil.countConsonantsChar(words);
        String months = "ЯНВАРЬ-ФЕВРАЛЬ-МАРТ-АПРЕЛЬ-МАЙ-ИЮНЬ-ИЮЛЬ-АВГУСТ-СЕНТЯБРЬ-ОКТЯБРЬ-НОЯБРЬ-ДЕКАБРЬ";
        someUtil.printListFromString(months);
        String sentence = "Сегодня отличный день для программирования";
        System.out.println(someUtil.countWordInString(sentence));
        String text = "Java удивительный язык программирования";
        System.out.println(someUtil.findLongestWord(text));
        String text2 = "Программирование на Java";
        someUtil.countAllChar(text2);
        System.out.println(someUtil.countAllChar2(text2));
        String phrase = "Пример строки для конвертации";
        someUtil.sentenceToSnakeSentence(phrase);
    }
}
