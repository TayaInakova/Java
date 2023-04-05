package seminars.seminar1.task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task1 {
    public static void start(){

        System.out.println("Hi!");
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("Дата: dd.MM.yyyy, время: hh:mm");
        System.out.println(formatter.format(now));
    }
}
