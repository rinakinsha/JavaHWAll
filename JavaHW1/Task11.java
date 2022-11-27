
/**
 * Задание 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */

package JavaHW1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите целое число: ");
        int number = Integer.parseInt(iScanner.nextLine());
        iScanner.close();
        int resultsum = sum(number);
        int resultmulti = multi(number);
        System.out.printf("Сумма чисел от 1 до %x: " + resultsum, number);
        System.out.printf("\nПроизведение чисел от 1 до %x: " + resultmulti, number);
    }

    static int sum(int n) {

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    static int multi(int n) {

        int multi = 1;
        for (int i = 1; i <= n; i++) {
            multi *= i;
        }

        return multi;
    }
}
