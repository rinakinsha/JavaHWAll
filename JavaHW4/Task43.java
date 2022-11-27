
/*Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.*/

package JavaHW4;

import java.util.LinkedList;

public class Task43 {
    public static void main(String[] args) {
       LinkedList <String> first = new LinkedList<>();
       first.add("hehehe");
       first.add("hohoho");
       first.add("hihihi");
       first.add("hahaha");

       System.out.println("Исходный список: "+ first);
       System.out.println("Перевернутый список: " + reverse(first));
    }

    static <T> LinkedList<T> reverse(LinkedList<T> listik) { 
        LinkedList <T> second = new LinkedList<>();
        for(int i = listik.size()-1; i >= 0; i--){
            second.add(listik.get(i));
        }
        return second; }
    
}
