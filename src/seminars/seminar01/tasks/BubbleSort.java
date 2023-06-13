package seminars.seminar01.tasks;

import seminars.seminar2.tasks.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
import static seminars.seminar01.tasks.WriteArray.writeIntegerArray;

public class BubbleSort {
    private static final Logger L = Log.log(BubbleSort.class.getName());
    public static int[] bubbleSorting(int[] arr) {
        String writeBubble;
        int temp;
        boolean sortArray = true;
        while (sortArray) {
            sortArray = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    sortArray = true;
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    writeBubble = writeIntegerArray(arr);
                    L.log(Level.INFO, writeBubble);
                }
            }
        }
        return arr;
    }
}