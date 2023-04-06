package seminars.seminar2.tasks;

// Напишите метод, который сжимает строку. Пример: aaaabbbcdd → a4b3cd2
public class ShortLine {
    public static String create(String str) {

        StringBuilder resultLine = new StringBuilder();
        for (int i = 0, j = 1; i < str.length(); i++) {
            if ((i == 0) || ((j == 1) && (str.charAt(i) != str.charAt(i - 1)))) {
                resultLine.append(str.charAt(i));
            } else if ((j != 1) && (str.charAt(i) != str.charAt(i - 1))) {
                resultLine.append(j);
                resultLine.append(str.charAt(i));
                j = 1;
            } else if (str.charAt(i) == str.charAt(i - 1)) {
                j++;
                if (i == str.length() - 1) {
                    resultLine.append(j);
                }
            }
        }
        return resultLine.toString();
    }
}
