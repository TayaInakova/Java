import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Homework2_2 {
    public static void main(String[] args) throws IOException {
        calculate();
    }


    public static void calculate() throws IOException { // Реализовать простой калькулятор
        String calc = "log_calc.txt";
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        String f = iScanner.nextLine();
        Integer first = Integer.parseInt(f);
        System.out.print("Введите второе число: ");
        String s = iScanner.nextLine();
        Integer second = Integer.parseInt(s);
        System.out.print("Введите знак операции: ");
        String n = iScanner.nextLine();
        iScanner.close();
        int res;
        String textToLog;
        switch (n) {
            case "+":
                res = first + second;
                textToLog = first + " + " + second + " = " + res;
                break;
            case "-":
                res = first - second;
                textToLog = first + " - " + second + " = " + res;
                break;
            case "*":
                res = first * second;
                textToLog = first + " * " + second + " = " + res;
                break;
            case "/":
                if (second == 0) {
                    textToLog = "Выражение: " + first + " / " + second + ".   На ноль делить нельзя!";
                } else {
                    res = first / second;
                    textToLog = first + " / " + second + " = " + res;
                }
                break;
            default:
                textToLog = "Неверный ввод.";
                break;
        }
        log(textToLog, calc);
        System.out.println(textToLog);
    }

    public static void log(String what, String where) throws IOException {
        Logger logger = Logger.getLogger(Homework2_2.class.getName());
        FileHandler fileName = new FileHandler(where);
        logger.addHandler(fileName);
        SimpleFormatter sFormat = new SimpleFormatter();
        fileName.setFormatter(sFormat);
        logger.info(what);
    }
}