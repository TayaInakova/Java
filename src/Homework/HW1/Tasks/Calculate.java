package Homework.HW1.Tasks;

import java.util.Scanner;

// Реализовать простой калькулятор
public class Calculate {
    public static void calc() {
        boolean flag = true;
        while (flag) {
            Scanner iScanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            String f = iScanner.next();
            Integer first = Integer.parseInt(f);
            System.out.print("Введите второе число: ");
            String s = iScanner.next();
            Integer second = Integer.parseInt(s);
            System.out.print("Введите знак операции: ");
            String n = iScanner.next();
            int res = 0;
            if (n.equals("+")) {
                res = first + second;
            } else if (n.equals("-")) {
                res = first - second;
            } else if (n.equals("*")) {
                res = first * second;
            } else if (n.equals("/")) {
                if (second == 0) {
                    System.out.println("На ноль делить нельзя!");
                } else {
                    res = first / second;
                }
            }
            System.out.println("Результат: " + res);
            System.out.print("Введите любую цифру, чтобы продолжить или 0, чтобы закончить вычисления:  ");
            String st = iScanner.next();
            int stop = Integer.parseInt(st);
            if (stop == 0) {
                flag = false;
            }
        }
    }
}