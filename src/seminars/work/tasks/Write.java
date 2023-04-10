package seminars.work.tasks;

public class Write {

    public static String writeString(String[] str) {

        StringBuilder a = new StringBuilder();
        for (int i = 0; i < str.length; i += 3) {
            a.append("Студент ").append(str[i]).append(" получил ").append(str[i + 1]).append(" по предмету ")
                    .append(str[i + 2]).append(".\n");
        }

        return a.toString();
    }
}
