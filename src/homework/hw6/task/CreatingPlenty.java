package homework.hw6.task;

import java.util.HashSet;
import java.util.Set;

public class CreatingPlenty {
    public static Set<Notebook> create() {
        Set<Notebook> notebooks = new HashSet<>();

        notebooks.add(new Notebook(235354, "hp omen", 2048, "intel core i7", 92900, 1024, "black", "windows 8", 10));
        notebooks.add(new Notebook(125354, "hp omen", 2048, "intel core i7", 92900, 1024, "red", "windows 8", 2));
        notebooks.add(new Notebook(842325, "asus turbo", 1024, "intel core i5", 112000, 2024, "red", "windows 10", 3));
        notebooks.add(new Notebook(432325, "asus turbo", 1024, "intel core i5", 112000, 2024, "white", "windows 10", 6));
        notebooks.add(new Notebook(633455, "aser aspire", 1024, "intel core i3", 50000, 512, "blue", "windows xp", 8));
        notebooks.add(new Notebook(633385, "aser aspire", 1024, "intel core i3", 50000, 512, "black", "windows xp", 15));
        notebooks.add(new Notebook(785254, "samsung rc", 512, "intel celeron", 140000, 512, "white", "linux", 5));
        notebooks.add(new Notebook(788254, "samsung rc", 512, "intel celeron", 140000, 512, "black", "linux", 10));
        notebooks.add(new Notebook(145612, "dexp", 2048, "intel core i5", 92000, 1024, "blue", "windows 8", 7));
        notebooks.add(new Notebook(144512, "dexp", 2048, "intel core i5", 92000, 1024, "red", "windows 8", 5));
        return notebooks;
    }
}
