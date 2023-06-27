package homework.hw3.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CreatingProductCollection {
    private static final List<String> nameList = new ArrayList<>(Arrays.asList("Дыня необыкновенная", "Помидор. Высший сорт",
            "Арбуз сочный", "Яблоко как яблоко", "Капуста обыкновенная", "Апельсин. Высший сорт"));
    private static final List<Integer> priceList = new ArrayList<>(Arrays.asList(25, 88, 55, 4, 12, 32));
    private static final List<Integer> gradeList = new ArrayList<>(Arrays.asList(1, 2, 3));

    public static int getRandomIntegerElement(List<Integer> list) { // Возвращает рандомный элемент целочисленного списка
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }

    public static String getRandomStringElement(List<String> list) { // Возвращает рандомный элемент списка строк
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }

    public static Product createOneRandomProduct() { // Возвращает объект со случайными параметрами
        Product product = new Product();
        product.setName(getRandomStringElement(nameList));
        product.setPrice(getRandomIntegerElement(priceList));
        product.setGrade(getRandomIntegerElement(gradeList));
        return product;
    }

    public static List<Product> create(int n) { // Возвращает список объектов со случайными параметрами указанного размера
        List<Product> productList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            productList.add(createOneRandomProduct());
        }
        return productList;
    }

}
