package JavaHW3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*1. Пусть дан произвольный список целых чисел, удалить из него четные числа*/

public class Task31 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        List<Integer> listik = new ArrayList<Integer>();
        listik.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(listik);

        for (int i = 0; i < listik.size(); i++) {

            if (listik.get(i) % 2 == 0) {
                listik.remove(i);
                i--;
            }
        }
        System.out.print(listik);
    }
}