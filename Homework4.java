/* 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
2. Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
3*. В калькулятор добавьте возможность отменить последнюю операцию. */

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
        
        Queue<String> q = new LinkedList<String>();
        q.add("один");
        q.add("два");
        q.add("три");
        q.add("четыре");
        q.add("пять");
        q.add("шесть");
        q.add("семь");
        q.add("восемь");
        q.add("девять");
        q.add("десять");
        
        // System.out.println("Queue header = " + q.element());
        // System.out.println("Size = " + q.size());
        // System.out.println("Queue elements ...");
        
        
        enqueue(q, "мама");Object ob;
        
        while ((ob = q.poll()) != null) {
            System.out.print(ob + " ");
        }
        
    }
    
// Переворачвает список
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

// Помещает элемент в конец очереди,
    public static void enqueue(Queue<String> a, String el) {

        a.add(el);

    }

// Возвращает первый элемент из очереди и удаляет его
    public static String dequeue(Queue<String> b) {

        String firstElement = b.element();
        b.remove();

        return firstElement;

    }

// возвращает первый элемент из очереди, не удаляя
    public static String first(Queue<String> c) {
        
        String firstElement = c.element();


        return firstElement;

    }


}
