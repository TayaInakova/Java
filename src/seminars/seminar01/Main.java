package seminars.seminar01;

//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;

import seminars.seminar01.tasks.BubbleSort;
import seminars.seminar01.tasks.ParserString;
import seminars.seminar01.tasks.WriteArray;

//1.Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
//2. Дана строка json:
//[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
// {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//    Написать метод, который распарсит этот текст и, используя StringBuilder, создаст строки вида:
//        Студент [фамилия] получил [оценка] по предмету [предмет]. Например:
//        Студент Иванов получил 5 по предмету Математика.
//        Студент Петрова получил 4 по предмету Информатика.
//        Студент Краснов получил 5 по предмету Физика.
public class Main {
    public static void main(String[] args) {
//        Задача 1
        int[] array = new int[]{4, 66, 76, 3, 51, 15, 10, 5};
        System.out.println(WriteArray.writeIntegerArray(BubbleSort.bubbleSorting(array)));


//        Задача 2
        String data = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        System.out.println(WriteArray.writeString(ParserString.parsing(data)));

//        Или:
//        JSONArray students = new JSONArray();
//        JSONObject person1 = new JSONObject();
//        person1.put("фамилия", "Иванов");
//        person1.put("оценка", "5");
//        person1.put("предмет", "Математика");
//        JSONObject person2 = new JSONObject();
//        person2.put("фамилия", "Петрова");
//        person2.put("оценка", "4");
//        person2.put("предмет", "Информатика");
//        JSONObject person3 = new JSONObject();
//        person3.put("фамилия", "Краснов");
//        person3.put("оценка", "5");
//        person3.put("предмет", "Физика");
//        students.add(person1);
//        students.add(person2);
//        students.add(person3);
//
//        for (Object student : students) {
//            JSONObject person = (JSONObject) student;
//
//            String lastName = person.get("фамилия").toString();
//            String grade = person.get("оценка").toString();
//            String subject = person.get("предмет").toString();
//            System.out.printf("Студент %s получил %s по предмету %s.\n", lastName, grade, subject);
//        }
    }
}
