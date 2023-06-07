package seminars.seminar1.task;

import java.util.Scanner;

public class Task3 {
    public static void start() {
        int sumNumber = 0;
        int multNumber = 1;

        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        String f = iScanner.next();
        iScanner.close();
        int number = Integer.parseInt(f);
        while (number > 0) {
            int temp = number % 10;
            number = number / 10;
            multNumber *= temp;
            sumNumber += temp;
        }
        int result = multNumber - sumNumber;
        System.out.println(result);
    }
}

