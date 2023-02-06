// Сортировка слиянием

// import java.util.ArrayList;

public class Homework3 {
    public static void main(String[] args) {
        
        int[] initialArray = {5, 1, 6, 2, 3, 4};
        mergeSorting(initialArray, initialArray.length);
        printArray(initialArray);

        // ArrayList() randomList = new ArrayList();
    }

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

    public static void printArray(int[] array) {

        for (int i : array) {
            System.out.print(i + " ");
        }

    }

}
