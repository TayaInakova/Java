import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
}