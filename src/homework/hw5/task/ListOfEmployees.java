package homework.hw5.task;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class ListOfEmployees {
    /**
     * @param s - имя сотрудника
     * @param i - сколько раз встречается
     * @apiNote красивый вывод
     */
    private static void printSort(String s, Integer i) {
        System.out.printf("Сотрудник %s повторяется %d раз(а)\n", s, i);
    }

    /**
     * @param names - список сотрудников
     * @apiNote Отсортировать по убыванию популярности.
     */
    public static void sort(String[] names) {
        Map<String, Integer> amountOfRepetitionsOfNames = removeNoRepetition(checkForRepetition(names));
        List<Integer> valueList = new ArrayList<>();
        for (Map.Entry<String, Integer> valueItem : amountOfRepetitionsOfNames.entrySet()) {
            valueList.add(valueItem.getValue());
        }
        valueList = valueList.stream().sorted().toList();
        String temp = null;
        for (int i = valueList.size() - 1; i >= 0; i--) {
            for (Map.Entry<String, Integer> ent : amountOfRepetitionsOfNames.entrySet()) {
                if (valueList.get(i).equals(ent.getValue())) {
                    printSort(ent.getKey(), ent.getValue());
                    temp = ent.getKey();
                }
            }
            amountOfRepetitionsOfNames.remove(temp);
        }
    }

    /**
     * @param emp - список имен сотрудников с количеством повторений
     * @return возвращает список имен сотрудников, встречающихся больше одного раза
     */
    private static Map<String, Integer> removeNoRepetition(Map<String, Integer> emp) {
        List<String> noRepetitionList = new ArrayList<>();
        for (Map.Entry<String, Integer> entries : emp.entrySet()) {
            if (entries.getValue().equals(1)) {
                noRepetitionList.add(entries.getKey());
            }
        }
        for (String elem :
                noRepetitionList) {
            emp.remove(elem);
        }
        return emp;
    }

    /**
     * @param employees - начальный список сотрудников
     * @return список имен сотрудников с количеством повторений
     */
    private static Map<String, Integer> checkForRepetition(String[] employees) {
        Map<String, Integer> temp = new HashMap<>();
        for (String employee : employees) {
            temp.putIfAbsent(employee, 0);
            temp.put(employee, temp.get(employee) + 1);
        }
        return temp;
    }
}
