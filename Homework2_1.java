import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Homework2_1 {
    public static void main(String[] args) throws IOException {
        int[] array = new int[] {4, 66, 76, 3, 51, 15, 10, 5};
        int[] newArray = bubble(array);
        String a = writeArray(newArray);
        System.out.println(a);
    }

    public static int[] bubble(int[] arr) throws IOException {

        Logger logger = Logger.getLogger(Homework2_1.class.getName());
        FileHandler fileName = new FileHandler("log_bubble.txt");
        logger.addHandler(fileName);
        SimpleFormatter sFormat = new SimpleFormatter();
        fileName.setFormatter(sFormat);

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
                    writeBubble = writeArray(arr);

                    logger.info(writeBubble);
                }
            }
        }
        return arr;
    }

    public static String writeArray(int[] arr) {
        StringBuilder text = new StringBuilder();
        for (int j : arr) {
            text.append(j).append(" ");
        }
        return text.toString();
    }
}