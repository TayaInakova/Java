package homework.hw1;

import homework.hw1.tasks.*;

public class Main {
    public static void main(String[] args) {
// Вычислить n-ое треугольное число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        int number = 4;
        int result1 = OperationsWithANumber.triangularNumber(number);
        int result2 = OperationsWithANumber.factorialNumber(number);
        System.out.printf("%d-ое треугольное число: %d,\nФакториал числа %d: %d.",number, result1, number, result2);

// Вывести все простые числа от 1 до 1000
        PrimeNumber.demonstrate(1, 1000);

// Реализовать простой калькулятор
        Calculator.calculate();
    }
}
