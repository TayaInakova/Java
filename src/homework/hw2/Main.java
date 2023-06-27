package homework.hw2;


import homework.hw2.task.*;

public class Main {
    public static void main(String[] args) {

// 1) Дана последовательность N целых чисел. Найти сумму простых чисел.
        int[] example1 = {77, 60, 98, 73, 56, 48, 95, 43, 61, 9};
        System.out.printf("Сумма простых чисел послеовательности равна: %d\n", SumPrimeNumbers.calculate(example1));

// 2) Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
        int[] example2 = {81, 54, 83, 38, 12, 10, 40, 26, 61, 48};
        IncreasingSequence.printAnswer(example2);

// 3) Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
        int[] example3 = {1, 22, -33, 44, 5, -5, -3, 23, -7};
        ReplacingElements.printResultArray(example3);

    }
}
