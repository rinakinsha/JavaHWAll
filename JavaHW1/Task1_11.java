/* Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len,
каждая ячейка которого равна initialValue; */

package JavaHW1;

public class Task1_11 {
    public static void main(String[] args) {
        int len = rnd();
        int initialValue = rnd();
        System.out.println("Сгенерированная длина массива: " + len);
        System.out.println("Сгенерированное значение ячеек: " + initialValue);
        printArray(arrayCreation(len, initialValue));
    }

    static int rnd() { /* генератор рандомных чисел в заданном диапазоне */
        int min = 5; /* Минимальное число для диапазона */
        int max = 20; /* Максимальное число для диапазона */
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    static int[] arrayCreation(int l, int v) { /* Заполнение массива */
        int arr[] = new int[l];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = v;
        }
        return arr;
    }

    static void printArray(int[] array) { /* Вывод массива в консоль */
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}