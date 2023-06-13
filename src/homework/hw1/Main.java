package homework.hw1;

import homework.hw1.task.*;

public class Main {

    public static void main(String[] args) {

// Given an input string s, reverse the order of the words.

        Reflection.turn("   мама   мыла   раму   ");
        Reflection.turn(" грибы сажает    волонтёр  ");
        Reflection.turn("  себе    под ноги он  глядел ");
        Reflection.turn("отряд не заметил ");

// Дана последовательность целых чисел, оканчивающаяся нулем.
// Найти сумму положительных чисел, после которых следует отрицательное число.

        System.out.println(SumPositiveNumbers.calculate());
    }
}