/*1. Реализовать алгоритм сортировки слиянием
  2. Пусть дан произвольный список целых чисел, удалить из него четные числа
  3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
*/

import java.util.ArrayList;
import java.util.Collections;

public class Homework3 {

    public static void main(String[] args) {

        int[] initialArray = {5, 1, 6, 2, 3, 4, 10, 7, 8, 9};
        mergeSorting(initialArray, initialArray.length);
        printArray(initialArray);

        List<Integer> randomList;
        randomList = Arrays.asList(5, 1, 6, 2, 3, 4, 10, 7, 8, 9);
        removeEvenNumbers(randomList);
        printList(randomList);

        List<Integer> randomList01 = Arrays.asList(5, 1, 6, 2, 3, 4, 10, 9);
        int arrayMean = arithmeticMean(randomList01);
        System.out.println("Максимум: " + Collections.max(randomList01));
        System.out.println("Минимум: " + Collections.min(randomList01));
        System.out.println("Среднее арифметическое: " + arrayMean);

    }

// Сортировка слиянием

    // Разделение массива
    public static void mergeSorting(int[] array, int lengthArray) {

        if (lengthArray < 2) {
            return;
        }

        int half = lengthArray / 2;
        int[] leftHalf = new int[half];
        int[] rightHalf = new int[lengthArray - half];

        for (int i = 0; i < half; i++) {
            leftHalf[i] = array[i];
        }

        for (int i = half; i < lengthArray; i++) {
            rightHalf[i - half] = array[i];
        }

        mergeSorting(leftHalf, half);
        mergeSorting(rightHalf, lengthArray - half);

        merge(array, leftHalf, rightHalf, half, lengthArray - half);

    }

    // слияние частей массива в один
    public static void merge(int[] wholeArray, int[] leftHalfArray, int[] rightHalfArray, int left, int right) {

        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {
            if (leftHalfArray[i] <= rightHalfArray[j]) {
                wholeArray[k++] = leftHalfArray[i++];
            } else {
                wholeArray[k++] = rightHalfArray[j++];
            }

        }

        while (i < left) {
            wholeArray[k++] = leftHalfArray[i++];
        }
        while (j < right) {
            wholeArray[k++] = rightHalfArray[j++];
        }

    }

    // Печать массива в консоль
    public static void printArray(int[] array) {

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    // Печать списка в консоль
    public static void printList(List<Integer> n) {

        for (int i : n) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    // удаление чётных элементов списка
    public static void removeEvenNumbers(List<Integer> numbers) {

        for (Integer number : numbers) {
            if ((number % 2) == 0) {
                numbers.remove(number);
            }
        }

    }

    // Среднее арифметическое элементов списка
    public static int arithmeticMean(List<Integer> numbers) {

        int a = 0;
        for (int i : numbers) {
            a += i;
        }
        a = a / numbers.size();
        return a;
    }

}
