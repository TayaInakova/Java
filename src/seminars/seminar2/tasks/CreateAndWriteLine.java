package seminars.seminar2.tasks;


import java.io.FileWriter;
import java.io.IOException;

public class CreateAndWriteLine {
    public static void writeInFile(String str) {
        try {
            FileWriter in = new FileWriter("test");
                in.append(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String createLine() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            builder.append("test\n");
        }
        return builder.toString();
    }
}
