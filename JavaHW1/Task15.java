/*
Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку,
указанное количество раз; */

package JavaHW1;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Напишите какое-нибудь веселое предложение :) : ");
        String str = iScanner.nextLine();
        System.out.printf("Укажите, сколько раз это необходимо повторить: ");
        int count = Integer.parseInt(iScanner.nextLine());
        iScanner.close();
        lineDuplication(str, count);
    }

    static void lineDuplication(String str, int c) {
        for (int i = 0; i < c; i++) {
            System.out.printf("%s\n", str);
        }
    }
}
