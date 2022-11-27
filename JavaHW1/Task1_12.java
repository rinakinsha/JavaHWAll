/* Задать одномерный массив и найти в нем минимальный и максимальный элементы */

package JavaHW1;

public class Task1_12 {
    public static void main(String[] args) {
        int len = rnd();
        int[] newArray = arrayCreation(len);
        printArray(newArray);
        int min = min(newArray);
        int max = max(newArray);
        System.out.println("MIN: " + min);
        System.out.println("MAX: " + max);
    }

    static int rnd() { /* генератор рандомных чисел в заданном диапазоне */
        int min = 1; /* Минимальное число для диапазона */
        int max = 20; /* Максимальное число для диапазона */
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    static int[] arrayCreation(int l) { /* Заполнение массива случайными значениями */
        int arr[] = new int[l];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd();
        }
        return arr;
    }

    static void printArray(int[] array) { /* Вывод созданного массива в консоль */
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
