/*Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2; */

package JavaHW1;

import java.util.Arrays;

public class Task19 {
    public static void main(String[] args) {
        int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println("Изначальный массив: " + Arrays.toString(array));
        newArray(array);
    }

    static void newArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println("Измененный массив: " + Arrays.toString(arr));
    }
}
