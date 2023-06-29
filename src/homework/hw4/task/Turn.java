package homework.hw4.task;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Turn {
    public static List<Integer> reverse(List<Integer> list1) { // LinkedList
        List<Integer> reverseList = new LinkedList<>();
        for (Integer elem : list1) {
            reverseList.add(0, elem);
        }
        return reverseList;
    }

    public static List<Integer> turnBack(List<Integer> list2) { // Stack
        Stack<Integer> turnBackList = new Stack<>();
        turnBackList.addAll(list2);
        List<Integer> result = new LinkedList<>();
        while (!turnBackList.isEmpty()) {
            result.add(turnBackList.pop());
        }
        return result;
    }
}