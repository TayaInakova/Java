package homework.hw1.task;

public class Reflection {

    public static void turn(String str) {
        String[] temporaryArray = str.split(" ");
        String resultString = "";
        for (int i = 0; i < temporaryArray.length; i++) {

            resultString += temporaryArray[i].trim();
            while (i < temporaryArray.length - 1) {
                resultString += " ";
            }
        }
        System.out.println(resultString);
    }
}
