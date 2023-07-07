package homework.hw6.task;

import java.util.*;

public class FilterNotebook {
    public static void filter(Set<Notebook> notebooks) {
        Map<Integer, String> criteriaMap = new HashMap<>();
        criteriaMap.put(1, "RAM");
        criteriaMap.put(2, "cost");
        criteriaMap.put(3, "hard drive");
        criteriaMap.put(4, "os");
        criteriaMap.put(5, "color");

        Integer criteria = FilterNotebook.getCriteria(criteriaMap);
        String criteriaValue = getCriteriaValue();
        switch (criteria) {
            case 1 ->
                    notebooks.stream().filter(item -> item.getRam().equals(Integer.parseInt(criteriaValue))).forEach(System.out::println);
            case 2 ->
                    notebooks.stream().filter(item -> item.getCost().equals(Integer.parseInt(criteriaValue))).forEach(System.out::println);
            case 3 ->
                    notebooks.stream().filter(item -> item.getHardDrive().equals(Integer.parseInt(criteriaValue))).forEach(System.out::println);
            case 4 ->
                    notebooks.stream().filter(item -> item.getOs().equals(criteriaValue)).forEach(System.out::println);
            case 5 ->
                    notebooks.stream().filter(item -> item.getColor().equals(criteriaValue.toLowerCase())).forEach(System.out::println);
            default ->
                    System.out.println("Нет параметра с таким номером");
        }
    }

    public static Integer getCriteria(Map<Integer, String> parameterList) {
        parameterList.forEach((number, description) -> System.out.println(number + " - " + description));
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите цифру соответствующую необходимому критерию: ");
        return sc.nextInt();
    }

    private static String getCriteriaValue() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение для указанного критерия: ");
        return sc.next();
    }
}
