package seminars.work.tasks;

public class ParserString {

    public static String[] parsing(String str) {

        String[] arr = str.split(",");
        for (int i = 0; i < arr.length; i++) {

            String[] sastr = arr[i].split(":");
            arr[i] = sastr[1].replaceAll("\"", "").replaceAll("}", "").replaceAll("]", "");
        }

        return arr;
    }
}
