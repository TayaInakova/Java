package homework.hw1.tasks;

import java.util.Scanner;

// Реализовать простой калькулятор
public class Calculator {
    public static void calculate() {

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
            System.out.print("Введите любой символ, чтобы продолжить или -, чтобы закончить вычисления:  ");
            String stopSymbol = iScanner.next();
            if (stopSymbol.equals("-")) {
                flag = false;
                iScanner.close();
            }
        }
    }
}