/* 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
2. Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя. */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Homework4 {
    public static void main(String[] args) {

        List<String> example = new LinkedList<>(Arrays.asList("one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine", "ten", "eleven", "twelve"));
        List<String> test = flipTheList(example);
        printStringList(example);
        printStringList(test);

        Queue<String> example01 = new LinkedList<String>();
        example01.add("один");
        example01.add("два");
        example01.add("три");
        example01.add("четыре");
        example01.add("пять");
        example01.add("шесть");
        example01.add("семь");
        example01.add("восемь");
        example01.add("девять");
        example01.add("десять");

        enqueue(example01, "мама");
        String a = dequeue(example01);
        String b = first(example01);

        System.out.println(a);
        System.out.println(b);
        printStringQueue(example01);

    }

    // Переворачивает список
    public static List<String> flipTheList(List<String> something) {

        List<String> newList = new LinkedList<>();
        for (String i : something) {
            newList.add(0, i);
        }
        return newList;
    }

    // Печатает список строк в консоль
    public static void printStringList(List<String> n) {

        for (String i : n) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    // Печатает очередь строк в консоль
    public static void printStringQueue(Queue<String> u) {

        Object ob;
        while ((ob = u.poll()) != null) {
            System.out.print(ob + " ");
        }
        
        System.out.println();

    }

    // Помещает элемент в конец очереди,
    public static void enqueue(Queue<String> a, String el) {

        a.add(el);

    }

    // Возвращает первый элемент из очереди и удаляет его
    public static String dequeue(Queue<String> b) {

        String firstElement = b.poll();

        return firstElement;

    }

    // возвращает первый элемент из очереди, не удаляя
    public static String first(Queue<String> c) {

        String firstElement = c.element();


        return firstElement;

    }


}
