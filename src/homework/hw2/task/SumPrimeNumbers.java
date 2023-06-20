package homework.hw2.task;

// Дана последовательность N целых чисел. Найти сумму простых чисел.
public class SumPrimeNumbers {
    public static boolean primeNumbers(int num) {
        int k = 0; // счётчик количества делителей числа
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                k++;
            }
        }
        return k == 2;
    }

    public static int calculate(int[] array) {
        int result = 0;
        for (int item : array) {
            boolean flag = primeNumbers(item);
            if (flag) {
                result += item;
            }
        }
        return result;
    }
}
