package homework.hw3;

import homework.hw3.task.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

// 1. Дан массив записей: наименование товара, цена, сорт.
// Найти наибольшую цену товаров 1го или 2-го сорта среди товаров, название которых содержит «высший».
        List<Product> foodstuff = CreatingProductCollection.create(10);
        System.out.println(foodstuff);
        System.out.println(HighestPriceSearch.find(foodstuff));

// 2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
// Получить наименования товаров заданного сорта с наименьшей ценой.
        List<Commodity> consumerGoods = CreatingCommodityCollection.create(10);
        System.out.println(consumerGoods);
        System.out.println(ListOfCheapCommodity.createList(consumerGoods));

// 3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
// Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А»
// и год издания после 2010 г, включительно.
        List<Book> bookshelf = new ArrayList<>();
        Book book1 = new Book("Каштанка", "Чехов", 500, 1887, 67);
        Book book2 = new Book("Гадкий утёнок", "Андерсен", 300, 1843, 53);
        Book book3 = new Book("Вторая жизнь Уве", "Бакман", 200, 2021, 31);
        Book book4 = new Book("Судьба человека", "Шолохов", 450, 1956, 41);
        Book book5 = new Book("Доктор Живаго. Подарочное издание", "Пастернак", 700, 2010, 149);
        Book book6 = new Book("Аленький цветочек", "Аксаков", 350, 1858, 59);
        Book book7 = new Book("Про Федота-стрельца, удалого молодца", "Филатов", 350, 1987, 83);
        bookshelf.add(book1);
        bookshelf.add(book2);
        bookshelf.add(book3);
        bookshelf.add(book4);
        bookshelf.add(book5);
        bookshelf.add(book6);
        bookshelf.add(book7);
        System.out.println(SelectionBooks.select(bookshelf));

// 4. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
        List<Integer> list = new ArrayList<>(Arrays.asList(45, 83, 66, 37, 63, 64, 89, 32, 34, 85));
        System.out.println(Procedure.min(list));
        System.out.println(Procedure.max(list));
        System.out.println(Procedure.average(list));
    }
}
