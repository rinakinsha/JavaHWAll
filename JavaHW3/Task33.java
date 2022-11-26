
/* Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать
номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов
(в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.*/

package JavaHW3;

import java.util.List;

public class Task33 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Настя", "7894512");
        phoneBook.add("Коля", "7423369");
        phoneBook.add("Алина", "7233366");
        phoneBook.add("Настя", "7412589");

        List<String> strings = phoneBook.get("Настя");
        System.out.println(strings);
    }
}
