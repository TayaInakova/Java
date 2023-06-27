package seminars.seminar00.tasks;


//        /Требования
//        Объявлена доска 9 x 9 необходимо отвалидировать в соответствии с правилами
//        1. Каждая строка должна содержать цифру 1-9 без повторения
//        2. Каждая колонка должна содержать цифру 1-9 без повторения
//        3. Каждый под блок из 9 элементов 3 x 3 должна содержать цифру 1-9 без повторения
//        Ограничения
//        • board.length == 9
//        • board[i].length == 9
//        • board[i][j] значение число или '.'
public class SudokuCheck {
    // static char[] checkArray = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public static boolean isValidSize(char[][] array) { // Соответствие размеров поля
        boolean checkSize = true;
        if (array.length == 9) {
            for (char[] ch : array) {
                if (ch.length != 9) {
                    checkSize = false;
                    break;
                }
            }
        } else {
            checkSize = false;
        }
        System.out.println("Размер поля: " + checkSize);
        return checkSize;
    }

    public static boolean isValidValue(char[][] array) { // Соответствие значения
        boolean checkValue = true;
        for (char[] arr : array) {
            for (char item : arr) {
                if (!(item == '.' || item == '1' || item == '2' || item == '3' || item == '4' || item == '5' ||
                        item == '6' || item == '7' || item == '8' || item == '9')) {
                    checkValue = false;
                    break;
                }
            }
        }
        System.out.println("Нет посторонних элементов: " + checkValue);
        return checkValue;
    }

    public static boolean noRepeatsInLine(char[][] array) { // Проверка отсутствия повторяющихся значеий в стороках
        boolean checkNoRepeatsInLine = true;
        for (char[] line : array) {
            for (char currentElement : line) {
                int count = 0;
                for (char checkElement : line) {
                    if (currentElement == checkElement && currentElement != '.') {
                        count++;
                    }
                }
                if (count > 1) {
                    checkNoRepeatsInLine = false;
                    break;
                }
            }
        }
        System.out.println("Значения в строках не повторяются: " + checkNoRepeatsInLine);
        return checkNoRepeatsInLine;
    }

    public static boolean noRepeatsInColumn(char[][] array) { // Проверка отсутствия повторяющихся значеий в колонках
        boolean checkNoRepeatsInColumn = true;
        for (int i = 0; i < (array.length/3); i++) {
            for (int j = 0; j < array[i].length/3; j++) {
                int count = 0;
                for (int k = 0; k < array[i].length/3; k++) {
                    if ((array[j][i] == array[k][i]) && (array[j][i] != '.')) {
                        count++;
                    }
                }
                if (count > 1) {
                    checkNoRepeatsInColumn = false;
                    break;
                }
            }
        }
        System.out.println("Значения в столбцах не повторяются: " + checkNoRepeatsInColumn);
        return checkNoRepeatsInColumn;
    }

//    public static boolean noRepeatsInBlock(char[][] array) { // Проверка отсутствия повторяющихся значеий в блоках 3х3
//        boolean checkNoRepeatsInBlock = true;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                int count = 0;
//                for (int k = 0; k < array[i].length; k++) {
//                    if ((array[j][i] == array[k][i]) && (array[j][i] != '.')) {
//                        count++;
//                    }
//                }
//                if (count > 1) {
//                    checkNoRepeatsInBlock = false;
//                    break;
//                }
//            }
//        }
//        System.out.println("Значения в блоках не повторяются: " + checkNoRepeatsInBlock);
//        return checkNoRepeatsInBlock;
//    }
    public static String isValidSudoku(char[][] array) {
        Boolean flag = isValidSize(array) && isValidValue(array) && noRepeatsInLine(array) && noRepeatsInColumn(array);
               // && noRepeatsInBlock(array);

        return flag.toString();
    }
}



