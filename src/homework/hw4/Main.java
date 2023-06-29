package homework.hw4;

import homework.hw4.task.BLinkList;
import homework.hw4.task.Turn;
import homework.hw4.task.Validity;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> example1 = new LinkedList<>();
        example1.add(1);
        example1.add(2);
        example1.add(3);
        example1.add(4);
        example1.add(5);
        System.out.println(Turn.reverse(example1));
        System.out.println(Turn.turnBack(example1));
        BLinkList example2 = new BLinkList();
        example2.in(1);
        example2.in(2);
        example2.in(3);
        example2.in(4);
        example2.in(5);
        example2.twist();

        // В зависимости от того, какой порядок считать правильным:
        String example3 = "[[(()){}]]";
        System.out.println(Validity.isValid(example3));
        String example4 = "[](){}[]";
        System.out.println(Validity.isReallyValid(example4));
    }
}
