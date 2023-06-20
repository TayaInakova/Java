package homework.hw2.task;

public class ReplacingElements {
    public static int addIndexes(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] > -100 && array[i] < -9) || (array[i] > 9 && array[i] < 100)) {
                result += i;
            }
        }
        return result;
    }

    public static int[] replace(int[] arr) {
        int sumIndex = addIndexes(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = sumIndex;
            }
        }
        return arr;
    }

    public static void printResultArray(int[] arrayToReplace) {
        for (int i : replace(arrayToReplace)) {
            System.out.printf("%d, ", i);
        }
    }
}
