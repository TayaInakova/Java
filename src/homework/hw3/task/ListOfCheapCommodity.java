package homework.hw3.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfCheapCommodity {
    public static List<Commodity> currentGradeList(List<Commodity> commodityList, int currentGrade) {
        List<Commodity> resultList = new ArrayList<>();
        for (Commodity item : commodityList) {
            if (item.getGrade().equals(currentGrade)){
                resultList.add(item);
            }
        }
        return resultList;
    }

    public static int getLowPrice(List<Commodity> commodityList, int currentGrade) {
        List<Commodity> tempList = currentGradeList(commodityList, currentGrade);
        int cost = tempList.get(0).getPrice();
        for (int i = 1; i < tempList.size(); i++) {
            if ((tempList.get(i).getPrice() < cost)) {
                cost = tempList.get(i).getPrice();
            }
        }
        return cost;
    }

    public static List<String> createList(List<Commodity> commodityList) {
        System.out.print("Введите сорт: ");
        Scanner iScanner = new Scanner(System.in);
        int category = iScanner.nextInt();
        List<String> itemList = new ArrayList<>();
        for (Commodity subject : commodityList) {
            if (subject.getGrade().equals(category) && subject.getPrice().equals(getLowPrice(commodityList, category))) {
                itemList.add(subject.getName());
            }
        }
        return itemList;
    }
}
