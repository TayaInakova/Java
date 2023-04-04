package Homework.HW1.Tasks;

// Вычислить n-ое треугольное число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class OperationsWithANumber {
    public static int triangularNumber(int n) {

        int triangular = 0;
        for (int i = 1; i <= n; i++) {
            triangular += i;
        }
//        Или:
//        triangular = (n/2)*(n+1);
        return triangular;
    }

    public static int factorialNumber(int n) {

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
