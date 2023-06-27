package homework.hw3.task;

import java.util.ArrayList;
import java.util.List;

public class SelectionBooks {
    public static boolean primeCheck(int number) {
        boolean flag = false;
        int k = 0; // счётчик количества делителей числа
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                k++;
            }
        }
        if (k == 2) {
            flag = true;
        }
        return flag;
    }

    public static List<String> select(List<Book> bookList) {
        List<String> resultList = new ArrayList<>();
        for (Book book : bookList) {
            if (primeCheck(book.getPageCount()) && book.getSurnameOfAuthor().toLowerCase().contains("а") && (book.getPublicationDate() >= 2010)) {
                resultList.add(book.getBookName());
            }
        }
        return resultList;
    }
}
