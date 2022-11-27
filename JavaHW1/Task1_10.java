/*Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), 
и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). 
Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, 
то есть [0][0], [1][1], [2][2], …, [n][n]; */

package JavaHW1;

public class Task1_10 {
    public static void main(String[] args) {
        int[][] twoDimArray = new int[10][10];
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0, x = twoDimArray[i].length - 1; j < twoDimArray[i].length; j++, x--) {
                if (i == j || i == x) {
                    twoDimArray[i][j] = 1;
                } else {
                    twoDimArray[i][j] = 0;
                }
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

}
