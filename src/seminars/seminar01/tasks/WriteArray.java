package seminars.seminar01.tasks;

public class WriteArray {
    public static String writeString(String[] str) {
        StringBuilder finalLine = new StringBuilder();
        for (int i = 0; i < str.length; i += 3)
            finalLine.append("Студент ").append(str[i]).append(" получил ").append(str[i + 1]).append(" по предмету ")
                    .append(str[i + 2]).append(".\n");
        return finalLine.toString();
    }

    public static String writeIntegerArray(int[] arr) {
        StringBuilder text = new StringBuilder();
        for (int j : arr) {
            text.append(j).append(" ");
        }
        return text.toString();
    }
}
