package seminars.seminar2.tasks;

// Напишите метод, который сжимает строку. Пример: aaaabbbcdd → a4b3cd2
public class ShortLine {
    public static String create(String originalLine) {

        StringBuilder resultLine = new StringBuilder();
        for (int i = 0, j = 1; i < originalLine.length(); i++) {
            if ((i == 0) || ((j == 1) && (originalLine.charAt(i) != originalLine.charAt(i - 1)))) {
                resultLine.append(originalLine.charAt(i));
            } else if ((j != 1) && (originalLine.charAt(i) != originalLine.charAt(i - 1))) {
                resultLine.append(j);
                resultLine.append(originalLine.charAt(i));
                j = 1;
            } else if (originalLine.charAt(i) == originalLine.charAt(i - 1)) {
                j++;
                if (i == originalLine.length() - 1) {
                    resultLine.append(j);
                }
            }
        }
        return resultLine.toString();
    }
}
