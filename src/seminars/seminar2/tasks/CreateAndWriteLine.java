package seminars.seminar2.tasks;

import java.io.FileWriter;
import java.io.IOException;

public class CreateAndWriteLine {
    public static void writeInFile() {
        try (FileWriter in = new FileWriter("Java\\src\\seminars\\seminar2\\test.txt")) {
            in.append(createLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String createLine() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            builder.append("test");
            if (i < 99)
                builder.append("\n");
        }
        return builder.toString();
    }
}
