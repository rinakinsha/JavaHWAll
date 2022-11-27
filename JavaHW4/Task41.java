
/*Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.*/

package JavaHW4;

import java.util.LinkedList;

public class Task41 {
    public static void main(String[] args) {
        int[] array = { 10, 5, 66, 78, 23, 45 };

        stack(array);
    }

    static void stack(int[] arr) {
        LinkedList<Integer> newStack = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            newStack.add(arr[i]);
        }
        System.out.println(newStack);
    }
    
}
