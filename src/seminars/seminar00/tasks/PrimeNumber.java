package seminars.seminar00.tasks;

// Вывести все простые числа от 1 до 1000
public class PrimeNumber {

    public static void demonstrate(int start, int finish) {
        System.out.printf("Простые числа от %d до %d:\n", start, finish);
        for (int i = start; i < finish; i++) {
            int k = 0; // счётчик количества делителей числа
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
}
