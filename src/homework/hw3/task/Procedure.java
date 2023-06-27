package homework.hw3.task;

import java.util.List;

public class Procedure {
    public static int min(List<Integer> numberList) {
        int result = numberList.get(0);
        for (int i : numberList) {
            if (i < result) {
                result = i;
            }
        }
        return result;
    }

    public static int max(List<Integer> numberList) {
        int result = numberList.get(0);
        for (int i : numberList) {
            if (i > result) {
                result = i;
            }
        }
        return result;
    }

    public static float average(List<Integer> numberList) {
        float result = 0;
        if (numberList.size() > 0) {
            for (int num : numberList) {
                result += num;
            }
            result /= numberList.size();
        }
        return result;
    }
}
