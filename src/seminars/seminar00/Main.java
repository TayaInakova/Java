package seminars.seminar00;


import seminars.seminar00.tasks.*;

public class Main {
    public static void main(String[] args) {

// Вычислить n-ое треугольное число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
//        int number = 4;
//        int result1 = OperationsWithANumber.triangularNumber(number);
//        int result2 = OperationsWithANumber.factorialNumber(number);
//        System.out.printf("%d-ое треугольное число: %d,\nФакториал числа %d: %d.\n",number, result1, number, result2);

// Вывести все простые числа от 1 до 1000
//        PrimeNumber.demonstrate(1, 1000);

// Реализовать простой калькулятор
//        Calculator.calculate();

// Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса,
// например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно
// решение или сообщить, что его нет.
//        RiddleWithNumbers.findNumbers("2? + ?5 = 69");
//        RiddleWithNumbers.findNumbers("7? + 5? = 45");

// 5) Отвалидировать доску судоку
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '.', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.printf("Validete: %s\n", SudokuCheck.isValidSudoku(board));
    }
}
