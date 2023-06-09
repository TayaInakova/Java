package homework.hw0.1.tasks;

public class RiddleWithNumbers {
    public static void findNumbers(String expression) {

        String[] temp = expression.split(" ");
        String firstNumberAsString = temp[0];
        String secondNumberAsString = temp[2];
        int result = Integer.parseInt(temp[4]);

        boolean hasDecision = false;

        for (Integer i = 0; i < 10; i++) {
            for (Integer j = 0; j < 10; j++) {
                int firstFoundNumber = Integer.parseInt(firstNumberAsString.replaceAll("\\?", i.toString()));
                int secondFoundNumber = Integer.parseInt(secondNumberAsString.replaceAll("\\?", j.toString()));
                if (result == firstFoundNumber + secondFoundNumber) {
                    hasDecision = true;
                    System.out.printf("%s + %s = %d\n", firstFoundNumber, secondFoundNumber, result);
                }
            }
        }
        if (!hasDecision) {
            System.out.println("Решений нет");
        }
    }
}
