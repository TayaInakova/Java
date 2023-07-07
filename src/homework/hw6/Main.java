package homework.hw6;

import homework.hw6.task.*;

import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Set<Notebook> notebookHashSet = new HashSet<>(CreatingPlenty.create());
        FilterNotebook.filter(notebookHashSet);
    }
}