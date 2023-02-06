// Homework 3

import java.util.ArrayList;
import java.util.Collections;

public class Homework3 {

    public static void main(String[] args) {

        int[] initialArray = {5, 1, 6, 2, 3, 4};
        mergeSorting(initialArray, initialArray.length);
        printArray(initialArray);

        ArrayList<Integer> randomList = new ArrayList<>();
        addToList(randomList);
        removeEvenNumbers(randomList);
        printList(randomList);

        ArrayList<Integer> randomList01 = new ArrayList<>();
        addToList(randomList01);
        int arrayMean = arithmeticMean(randomList01);
        System.out.println("Максимум: " + Collections.max(randomList01));
        System.out.println("Минимум: " + Collections.min(randomList01));
        System.out.println("Средне арифметическое: " + arrayMean);


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

    // Добавление элементов в список
    public static ArrayList<Integer> addToList(ArrayList<Integer> num) {

        for (int i = 0; i < 10; i++) {
            num.add(i);
        }
        return num;
    }

    // Печать списка в консоль
    public static void printList(ArrayList<Integer> n) {

        for (int i : n) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    // удаление чётных элементов списка
    public static void removeEvenNumbers(ArrayList<Integer> numbers) {

        for (int i = 0; i < numbers.size(); i++) {
            if ((numbers.get(i) % 2) == 0) {
                numbers.remove(numbers.get(i));
            }
        }

    }

    // Среднее арифметическое элементов списка
    public static int arithmeticMean(ArrayList<Integer> numbers) {

        int a = 0;
        for (int i : numbers) {
            a += i;
        }
        a = a / numbers.size();
        return a;
    }

}
