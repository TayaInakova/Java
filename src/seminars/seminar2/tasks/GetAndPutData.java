package seminars.seminar2.tasks;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GetAndPutData {
    private static final Logger LOG = Log.log(GetAndPutData.class.getName());

    public static void putFilesNameInFile(String filePath) {
        try (FileWriter in = new FileWriter("src\\seminars\\seminar2\\name.txt")) {
            String[] NamesArray = getFilesNameInFolder(filePath);
            for (String item : NamesArray) {
                in.append(item).append("\n");
            }
            System.out.println("Done!");
        } catch (IOException e) {
            LOG.log(Level.INFO, e.getMessage());
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
