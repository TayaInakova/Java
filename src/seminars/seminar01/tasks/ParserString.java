package seminars.seminar01.tasks;

public class ParserString {

    public static String[] parsing(String str) {

        String[] arr = str.split(",");
        for (int i = 0; i < arr.length; i++) {

            String[] strArray = arr[i].split(":");
            arr[i] = strArray[1].replaceAll("\"", "").replaceAll("}", "").replaceAll("]", "");
        }

        return arr;
    }
}
