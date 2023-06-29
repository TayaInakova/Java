package seminars.seminar3;

import seminars.seminar3.task.SimplifyingPath;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("штука1", "страна1", 6);
        System.out.println(item1);
        System.out.println(SimplifyingPath.simplify("//C://Users///Gluck/uijh/../Desktop/./Плей, мать его, лист"));
        System.out.println(SimplifyingPath.simplify("/home//foo/"));
    }
}
