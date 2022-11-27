package JavaHW4;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/*Реализовать консольное приложение, которое:
 * Принимает от пользователя строку вида text~num;
 * Нужно рассплитить строку по ~, сохранить text в связный список на позицию num;
 * Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка;
 * Если ввод не содержит символа ~, то завершает программу с ошибкой;
 * Если введено -1, то выходим. */

public class Task44 {
    public static <T> void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        
        System.out.printf("Введите строку типа twxt~num: ");
        LinkedList <String> second = new LinkedList<>();
        

        while (true) {
            String word = iScanner.nextLine();
            String [] subStr;
            String delimeter = "~";
            subStr = word.split(delimeter);
            int pos = Integer.parseInt(subStr[1]);
            System.out.println(pos);
            second.add(pos, subStr[0]);
            System.out.println(second);
        }

        

        


        

        /*System.out.println(Arrays.toString(subStr));*/
        
        /*Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (true) {
            String word = scanner.nextLine();
            if (Objects.equals(word, "print")) {
                for (int i = list.size() - 1; i > -1; i--) {
                    System.out.print(list.get(i) + " ");
                }
                System.out.println();
                continue;
            }
            if (Objects.equals(word, "revert")) {
                if (list.size() != 0) {
                    list.remove(list.size() - 1);
                }
                continue;
            }
            list.add(word);
            if (Objects.equals(word, "end")) return;
        } */
    }

    private static int parseInt(String string) {
        return 0;
    }

    
}
