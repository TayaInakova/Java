/* 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
   2. Реализуйте очередь с помощью LinkedList со следующими методами:
       enqueue() - помещает элемент в конец очереди,
       dequeue() - возвращает первый элемент из очереди и удаляет его,
       first() - возвращает первый элемент из очереди, не удаляя.
   3*. В калькулятор добавьте возможность отменить последнюю операцию. */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Homework4 {
    public static void main(String[] args) {

        List<String> example = new LinkedList<>(Arrays.asList("one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine", "ten", "eleven", "twelve"));
        List<String> test = flipTheList(example);
        printStringList(example);
        printStringList(test);
    }

    public static List<String> flipTheList(List<String> something) {

        List<String> newList = new LinkedList<>();
        for (int i = (something.size() - 1); i >= 0; i--) {
            newList.add(something.get(i));
        }
        return newList;
    }

    public static void printStringList(List<String> n) {

        for (String i : n) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

}
