package seminars.seminar1.task;

import java.util.HashMap;
import java.util.Map;

public class Conversion {
    public static int convert(String str) {
        Map<Character, Integer> base = new HashMap<>();
        base.put('I', 1);
        base.put('V', 5);
        base.put('X', 10);
        base.put('L', 50);
        base.put('C', 100);
        base.put('D', 500);
        base.put('M', 1000);

        int result = base.get(str.charAt(str.length() - 1));

        for (int i = str.length() - 2; i >= 0; i--) {
            if (base.get(str.charAt(i)) < base.get(str.charAt(i + 1))) {
                result -= base.get(str.charAt(i));
            } else {
                result += base.get(str.charAt(i));
            }
        }
        return result;
    }
}
