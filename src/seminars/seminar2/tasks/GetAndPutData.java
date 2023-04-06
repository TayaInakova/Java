package seminars.seminar2.tasks;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GetAndPutData {

    public static void putFilesNameInFile(String filePath) {
        String[] NamesArray = getFilesNameInFolder(filePath);
        try (FileWriter in = new FileWriter("Java\\src\\seminars\\seminar2\\name.txt")) {
            for (String item : NamesArray) {
                in.append(item + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String[] getFilesNameInFolder(String path) {
        File dir = new File(path);
        String[] result = null;
        File[] files;
        if (dir.isDirectory()) {
            files = dir.listFiles();
            if (files != null) {
                result = new String[files.length];
                for (int i = 0; i < files.length; i++) {
                    String name = files[i].getName();
                    if (files[i].isFile()) {
                        System.out.println("\tFile - " + name);
                    } else {
                        System.out.println("Directory - " + name);
                    }
                    result[i] = name;
                }
            }
        } else {
            System.out.println(dir.getName() + " - не является папкой");
        }
        return result;
    }
}
