package homework.hw3.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CreatingCommodityCollection {
    private static final List<String> nameList = new ArrayList<>(Arrays.asList("Мыло", "Отвертка",
            "Полотенце для рук", "Шампунь", "Садовая тачка", "Зубная паста"));
    private static final List<String> countryList = new ArrayList<>(Arrays.asList("Россия", "Япония",
            "Италия", "Канада", "Германия", "Франция"));
    private static final List<Integer> priceList = new ArrayList<>(Arrays.asList(100, 311, 116));
    private static final List<Integer> weightList = new ArrayList<>(Arrays.asList(57, 94, 99, 52, 75, 97, 10, 47, 78, 33));
    private static final List<Integer> gradeList = new ArrayList<>(Arrays.asList(1, 2, 3));

    public static int getRandomIntegerElement(List<Integer> list) { // Возвращает рандомный элемент целочисленного списка
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }

    public static String getRandomStringElement(List<String> list) { // Возвращает рандомный элемент списка строк
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }

    public static Commodity createOneRandomCommodity() { // Возвращает объект со случайными параметрами
        Commodity com = new Commodity();
        com.setName(getRandomStringElement(nameList));
        com.setCountry(getRandomStringElement(countryList));
        com.setWeight(getRandomIntegerElement(weightList));
        com.setPrice(getRandomIntegerElement(priceList));
        com.setGrade(getRandomIntegerElement(gradeList));
        return com;
    }

    public static List<Commodity> create(int n) { // Возвращает список объектов со случайными параметрами указанного размера
        List<Commodity> commodityList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            commodityList.add(createOneRandomCommodity());
        }
        return commodityList;
    }

}