package homework.hw5.task;


import java.util.*;

public class ListOfEmployees {
    /**
     * @param s - имя сотрудника
     * @param i - сколько раз встречается
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
        List<Integer> repetitionList = new ArrayList<>(getValueList(amountOfRepetitionsOfNames));
        String temp = null;
        for (int i = repetitionList.size() - 1; i >= 0 ; i--) {
            for (Map.Entry<String, Integer> ent : amountOfRepetitionsOfNames.entrySet()) {
                if (ent.getValue().equals(repetitionList.get(i))) {
                    printSort(ent.getKey(), ent.getValue());
                    temp = ent.getKey();
                }
            }
            while (amountOfRepetitionsOfNames.containsKey(temp)){
                amountOfRepetitionsOfNames.remove(temp);
            }
        }
    }

    /**
     * @param MapOfNames - список имен, встречающихся больше одного раза
     * @return список чисел повторений имён, отсортированный по возрастанию
     */
    private static List<Integer> getValueList(Map<String, Integer> MapOfNames) {
        Set<Integer> valueSet = new HashSet<>();
        for (Map.Entry<String, Integer> valueItem : MapOfNames.entrySet()) {
            valueSet.add(valueItem.getValue());
        }
        List<Integer> valueList = new ArrayList<>(valueSet);
        valueList = valueList.stream().sorted().toList();
        return valueList;
    }


    /**
     * @param employeesRepetition - список имен сотрудников с количеством повторений
     * @return возвращает список имен сотрудников, встречающихся больше одного раза
     */
    private static Map<String, Integer> removeNoRepetition(Map<String, Integer> employeesRepetition) {
        List<String> noRepetitionList = new ArrayList<>();
        for (Map.Entry<String, Integer> entries : employeesRepetition.entrySet()) {
            if (entries.getValue().equals(1)) {
                noRepetitionList.add(entries.getKey());
            }
        }
        for (String elem :
                noRepetitionList) {
            employeesRepetition.remove(elem);
        }
        return employeesRepetition;
    }

    /**
     * @param employees - начальный список сотрудников
     * @return список имен сотрудников с количеством повторений
     */
    private static Map<String, Integer> checkForRepetition(String[] employees) {
        Map<String, Integer> check = new HashMap<>();
        for (String employee : employees) {
            check.putIfAbsent(employee, 0);
            check.put(employee, check.get(employee) + 1);
        }
        return check;
    }
}
