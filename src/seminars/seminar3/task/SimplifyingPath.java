package seminars.seminar3.task;

import java.util.Stack;

public class SimplifyingPath {
    public static String simplify(String path) {
        Stack<String> newStack = new Stack<>();
        StringBuilder res = new StringBuilder();
        String[] temp = path.split("/");
        for (String s : temp) {
            if (s.equals("..") && !newStack.isEmpty()) {
                newStack.pop();
            } else if (!s.equals(".") && !s.isEmpty()) {
                newStack.add(s);
            }
        }
        if (newStack.isEmpty()) {
            return "/";
        } else {
            for (Object o : newStack) {
                res.append("/").append(o);
            }
        }
        return res.toString();
    }
}
