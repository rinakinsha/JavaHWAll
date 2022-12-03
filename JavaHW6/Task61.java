package JavaHW6;

import java.util.*;

public class Task61 {
    public static void main(String[] args) {
        Map<Integer, LinkedHashMap<String, String>> database = new HashMap<Integer, LinkedHashMap<String, String>>();
        Notebooks NB1 = new Notebooks("Lenovo IdeaPad3", 15.6, "Windows 11 Home", 8, "Intel UHD Graphics",
                "Intel Core i3", "SSD", 256, "golden", 1699);
        Notebooks NB2 = new Notebooks("HP 15s", 15.6, "DOS", 8, "AMD Radeon Vega 7", "AMD Ryzen 5 5500U", "SSD", 512,
                "silver", 2099);
        Notebooks NB3 = new Notebooks("HP 255 G9 (5Y3X5EA)", 15.6, "DOS", 8, "AMD Radeon Vega 7", "	AMD Ryzen 5 5625U",
                "SSD", 512, "silver", 1899);
        Notebooks NB4 = new Notebooks("Apple MacBook Air 13", 13.3, "macOS", 8, "Apple M2 8-core GPU", "Apple M2",
                "SSD", 256, "gray", 3999);
        Notebooks NB5 = new Notebooks("Asus TUF Gaming F15", 15.6, "DOS", 16, "NVIDIA GeForce RTX 3050",
                "Intel Core i5-11400H", "SSD", 512, "black", 3999);

        Integer id = 1;
    }

    static Map addInDataBase(Map listik, Notebooks nb, Integer newId) {
        ArrayList<String> newNb = new ArrayList<String>(Arrays.asList(nb.toString().split(", ")));
        Map<String, String> info = new LinkedHashMap<String, String>();
        String[] infoName = { "model", "diagonal", "operatingSystem", "capacityRam", "typeVideoCard", "typeProcessor",
                "typeHardDrive", "capacityHardDrive", "color", "price" };
        Integer i = 0;
        for (String str : newNb) {
            info.put(infoName[i], str);
            i++;
        }
        listik.put(newId, info);
        return listik;
    }

    static void searchNb(Map spisok) {
        String findModel = "null";
        String findSystem = "null";
        Integer findRam = 0;
        Integer findHard = 0;
        String findColor = "null";
        Integer findPrice = 0;
        Map searchRequirements = new HashMap<>();
        searchRequirements.put("model", findModel);
        searchRequirements.put("operatingSystem", findSystem);
        searchRequirements.put("capacityRam", findRam);
        searchRequirements.put("capacityHardDrive", findHard);
        searchRequirements.put("color", findColor);
        searchRequirements.put("price", findPrice);
        Map searchRequirementsZero = new HashMap<>();
        searchRequirementsZero.putAll(searchRequirements);

        Scanner input = new Scanner(System.in);

        
            System.out.printf("Критерии поиска: ");
            System.out.println(searchRequirements);
            System.out.println("Веберите критерий для поиска:\n" +
                    "1 - модель\n" +
                    "2 - операционная система\n" +
                    "3 - ОЗУ (минимальное значение)\n" +
                    "4 - объем жесткого диска (минимальное значение)\n" +
                    "5 - цвет\n" +
                    "6 - цена (минимальное значение)\n" +
                    "result - вывести список согласно фильтра\n" +
                    "clear - сбросить фильтр\n" +
                    "end - завершение работы");

            String comand = input.next();

            switch (comand) {
                case "end":
                    input.close();
                    System.exit(1);
                case "1":
                    System.out.println("Введите модель: ");
                    findModel = input.toString();
                    searchRequirements.put("model", findModel);
                    break;
                case "2":
                    System.out.println("Введите операционную систему: ");
                    findSystem = input.toString();
                    searchRequirements.put("operatingSystem", findSystem);
                    break;
                case "3":
                    System.out.println("Введите объем ОЗУ: ");
                    findRam = input.nextInt();
                    searchRequirements.put("capacityRam", findRam);
                    break;
                case "4":
                    System.out.println("Введите объем жесткого диска: ");
                    findHard = input.nextInt();
                    searchRequirements.put("capacityHardDrive", findHard);
                    break;
                case "5":
                    System.out.println("Введите цвет: ");
                    findColor = input.next();
                    searchRequirements.put("color", findColor);
                    break;
                case "6":
                    System.out.println("Введите цену: ");
                    findPrice = input.nextInt();
                    searchRequirements.put("price", findPrice);
                    break;
                case "result":
                    boolean flag = false;
                    for (int i = 1; i <= spisok.size(); i++) {
                        if ((((Map) spisok.get(i)).get("model")).equals(findModel)
                                || findModel == "null") {
                            if ((((Map) spisok.get(i)).get("operatingSystem")).equals(findSystem)
                                    || findSystem == "null") {
                                if (Integer.parseInt(
                                        ((String) ((Map) spisok.get(i)).get("capacityRam"))) >= findRam
                                        || findRam == 0) {
                                    if (Integer.parseInt(
                                            ((String) ((Map) spisok.get(i)).get("capacityHardDrive"))) >= findHard
                                            || findHard == 0) {
                                        if ((((Map) spisok.get(i)).get("color").equals(findColor))
                                                || findColor == "null") {
                                            if (Integer.parseInt(
                                                    ((String) ((Map) spisok.get(i)).get("price"))) >= findPrice
                                                    || findPrice == 0) {
                                                System.out.println(spisok.get(i));
                                                flag = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                
                    if (!flag) {
                        System.out.println("Нет ноутбуков, удовлетворяющих требованиям");
                    }
                    break;
                case "clear": 
                    searchRequirements.putAll(searchRequirementsZero);
                    break;
                default:
                    System.out.println("Введены неверные данные");
                    break;
            }        
        }
    }

