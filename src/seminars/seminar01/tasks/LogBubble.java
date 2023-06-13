package seminars.seminar01.tasks;

import java.util.logging.Logger;
import java.io.FileInputStream;
import java.util.logging.LogManager;

public class LogBubble {
    static {
        try (FileInputStream inBubble = new FileInputStream("src\\homework\\hw2\\tasks\\logBubble.config")) {
            LogManager.getLogManager().readConfiguration(inBubble);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Logger log(String className) {
        return Logger.getLogger(className);
    }
}
