package homework.hw1.task;

public class Reflection {

    public static void turn(String str) {
        String[] temporaryArray = str.split(" ");
        String resultString = "";
        for (int i = 0; i < temporaryArray.length; i++) {
            if (!temporaryArray[i].equals("")) {
                resultString = temporaryArray[i].concat(resultString);
                if (i != temporaryArray.length - 1) {
                    resultString = " ".concat(resultString);
                }
            }
        }
        System.out.println(resultString);
    }
}
