package homework.hw2.task;

// Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
public class IncreasingSequence {
    public static boolean compare(int[] array) {
        boolean flag = false;
        for (int i = 1; i < array.length; i++) {
            flag = array[i] > array[i - 1];
        }
        return flag;
    }


    public static void printAnswer(int[] arr) {
        boolean f = compare(arr);
        if (f) {
            System.out.println("Последовательность является возрастающей.");
        } else {
            System.out.println("Последовательность не является возрастающей.");
        }
    }
}
