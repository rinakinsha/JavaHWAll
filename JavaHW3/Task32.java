package JavaHW3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка. */

public class Task32 {
    public static void main(String[] args) {
        List<Integer> listik = new ArrayList<Integer>();
        listik.addAll(Arrays.asList(11, 2, 73, 44, 85, 36, 17, 69));
        System.out.println(listik);

        double sum = 0;
        for (int i = 0; i < listik.size(); i++) {
            sum += listik.get(i);
        }

        System.out.println("Минимальное значение: " + Collections.min(listik));
        System.out.println("Максимальное значение: " + Collections.max(listik));
        System.out.printf("Среднее значение: %.1f", sum / listik.size());
    }
}
