
/* Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.*/

package JavaHW4;

import java.util.ArrayDeque;
import java.util.Queue;

public class Task42 {
    public static void main(String[] args) {

        int[] array = { 10, 5, 66, 78, 23, 45 };

        queue(array);
    }

    static void queue(int[] arr) {
        Queue<Integer> newQueue = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {
            newQueue.add(arr[i]);
        }
        System.out.println(newQueue);
    }
}
