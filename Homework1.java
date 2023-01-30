import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Homework1 {
    public static void main(String[] args) {
        // task1();
        // task2();
        // task3();
        task4();
    }

    public static void task1() { // Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение
                                 // чисел от 1 до n)
        int n = 5;
        int triangularNumber = 0;
        int factorial = 1;
        for (int i = 1; i < n + 1; i++) {
            triangularNumber += i;
            factorial *= i;
        }
        System.out.println(
                n + "-ое треугольное число: " + triangularNumber + "\nФакториал числа " + n + " : " + factorial);
    }

    public static void task2() { // Вывести все простые числа от 1 до 1000
        System.out.println("Простые числа от 0 до 1000:");
        int n = 1000;
        for (int i = 1; i < n; i++) {
            int k = 0;
            for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        k++;
                    }
            }
            if (k == 2) {
                
                System.out.println(i);
            }
        }
    }

    public static void task3() { // Реализовать простой калькулятор
        Scanner iScanner = new Scanner(System.in);
         System.out.printf("Введите первое число: ");
         String f = iScanner.nextLine();
         Integer first = Integer.parseInt (f);
         System.out.printf("Введите второе число: ");
         String s = iScanner.nextLine();
         Integer second = Integer.parseInt (s);
         System.out.printf("Введите знак операции: ");
         String n = iScanner.nextLine();
         iScanner.close();
        int res = 0;
        switch(n) {
            case "+":
                res = first + second;
                break;
            case "-":
                res = first - second;
                break;
            case "*":
                res = first * second;
                break;
            case "/":
                res = first / second;
                break;
        }
        System.out.println("Результат: " + res);
    }

// *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса,
// например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно
// решение или сообщить, что его нет.

    public static void task4() {
        String expression = "2? + ?5 = 69";
        String[] term = expression.split(" ");
        String term1 = term[0];

        String term2 = term[2];
        String result0 = term[4];
        int result = Integer.parseInt(result0);

        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();
        boolean hasDecision = false;

        for (Integer i = 0; i < 10; i++) {
            for (Integer j = 0; j < 10; j++) {
                String t1 = term1.replaceAll("\\?", i.toString());
                String t2 = term2.replaceAll("\\?", j.toString());
                int i1 = Integer.parseInt(t1) +
                        Integer.parseInt(t2);
                if (i1 == result) {
                    hasDecision = true;
                    result1.add(i);
                    result2.add(j);
                    System.out.printf("%s + %s = %d\n", t1, t2, result);
                }
            }
        }
        if (!hasDecision) {
            System.out.println("Решений нет");
        }
    }
}