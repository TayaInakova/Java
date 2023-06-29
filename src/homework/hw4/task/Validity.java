package homework.hw4.task;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Validity {
    public static boolean isValid(String str) {
        List<String> l = Arrays.asList(str.split(""));
        if (l.size() % 2 == 0) {
            Stack<String> temp = new Stack<>();
            for (String s : l) {
                if ((s.equals(")") && temp.peek().equals("(") || (s.equals("}") && temp.peek().equals("{"))
                        || (s.equals("]") && temp.peek().equals("[")))) {
                    temp.pop();
                } else {
                    temp.add(s);
                }
            }
            return temp.isEmpty();
        } else {
            return false;
        }
    }

    public static boolean isReallyValid(String string) {
        boolean flag = false;
        List<String> l = Arrays.asList(string.split(""));
        if (l.size() % 2 == 0) {
            for (int i = 0; i < l.size(); i += 2) {
                if ((l.get(i).equals("(") || l.get(i).equals("{") || l.get(i).equals("[")) &&
                        (l.get(i + 1).equals("}") || (l.get(i + 1).equals("]") || l.get(i + 1).equals(")")))) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            return flag;
        } else {
            return false;
        }
    }
}
