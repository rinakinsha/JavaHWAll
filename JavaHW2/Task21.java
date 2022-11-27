
/*Напишите метод, который принимает на вход строку (String)
и определяет является ли строка палиндромом (возвращает boolean значение).*/

/* Пометка для себя: char charAt(int index) возвращает значение char по указанному индексу.
Индекс колеблется от 0 до length()-1. */

package JavaHW2;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите слово или предложение: ");
        String word = iScanner.nextLine();
        iScanner.close();
        boolean result = palindrome(word);
        System.out.println(result);
    }

    static boolean palindrome(String str) {
        String str1 = str.replaceAll("\\W", ""); /* убираем из строки все ненужные символы (запятые, пробелы и т.д.) */
        str1 = str1.toLowerCase(); /* при вводе слова c большой буквы на ЛАТИНИЦЕ все равно выдает false */
        for (int i = 0; i < str1.length() / 2; i++) {
            if (str1.charAt(i) != str1.charAt(str1.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
