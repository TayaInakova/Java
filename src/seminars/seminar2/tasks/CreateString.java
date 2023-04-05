package seminars.seminar2.tasks;

public class CreateString {
    public static String run(int n, char c1, char c2) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < (n / 2); i++) {
            builder.append(c1);
            builder.append(c2);
        }
        return builder.toString();
    }
}
