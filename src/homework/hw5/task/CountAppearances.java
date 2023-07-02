package homework.hw5.task;

import java.util.HashMap;
import java.util.Map;


public class CountAppearances {
    /**
     * @param str Исходная строка
     * @return массив слов искомой строки в нижнем регистре, без знаков препинания
     */
    public static String[] separateCorrect(String str) {
        Character[] punctuationMarks = {'.', ',', '!', '?', '-', ':', ';', '/'};
        for (Character mark : punctuationMarks) {
            str = str.replace(mark, ' ');
        }
        str = str.toLowerCase();
        return str.split(" ");
    }

    /**
     * @param text        - исходный текст,
     * @param currentWord - слово, количество вхождений которого необходимо посчитать
     * @return количество повторений
     * @apiNote Подсчитать количество искомого слова, через map
     */
    public static int calculate(String text, String currentWord) {
        Map<String, Integer> requestWordCount = new HashMap<>();
        String[] currentList = separateCorrect(text);
        for (String s : currentList) {
            if (s.equals(currentWord)) {
                requestWordCount.putIfAbsent(currentWord, 0);
                requestWordCount.put(currentWord, requestWordCount.get(currentWord) + 1);
            }
        }
        return requestWordCount.get(currentWord);
    }
}
