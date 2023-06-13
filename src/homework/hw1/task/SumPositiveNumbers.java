package homework.hw1.task;

import java.util.Scanner;

public class SumPositiveNumbers {
    public static int calculate() {
        int result = 0;
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите последовательность целых чисел, заканчивающуюся нулём: ");
        String t = iScanner.next();
        int temp = Integer.parseInt(t);
        while (temp != 0) {
            String n = iScanner.next();
            int num = Integer.parseInt(n);
            if (temp > 0 && num < 0){
                result += temp;
            }
            temp = num;
        }
        return result;
    }
}
