package lec6;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Методи класу HashMap
 */
public class Ex6_1 {
    public static void main(String[] args) {

        Map<Integer, String> nameOfNumbers = new HashMap<Integer, String>();
        nameOfNumbers.put(1, "One");
        nameOfNumbers.put(2, "two");
        nameOfNumbers.put(4, "Four");
        nameOfNumbers.put(3, "Three");

        // показуємо мапу
        System.out.println("HashMap: " + nameOfNumbers);

        // отримаємо об'єкт по ключу 2
        String nameOf2 = nameOfNumbers.get(2);
        System.out.println("HashMap[2]: " + nameOf2);

        // отримаємо весь набір ключів
        Set<Integer> keys = nameOfNumbers.keySet();
        System.out.println("Key set: " + keys);

        // отримаємо набір всіх значень
        Collection<String> values = nameOfNumbers.values();
        System.out.println("Values collection: " + values);

        // замінити елемент
        nameOfNumbers.replace(2, "Two");
        System.out.println("Replace of HashMap[2]!");

        // видалення елемента по ключу 4
        nameOfNumbers.remove(4);
        System.out.println("Remove HashMap[4]!");

        System.out.println("New HashMap: ");
        // перебір елементів
        for (Integer key: nameOfNumbers.keySet()) {
            System.out.printf("\tKey:%d Value:%S %n", key, nameOfNumbers.get(Integer.valueOf(key)));
        }

        System.out.println("Same with entrySet: ");
        // перебір елементів за допомогою entrySet
        for (Map.Entry<Integer, String> item : nameOfNumbers.entrySet()) {
            System.out.printf("\tKey:%d Value:%S %n", item.getKey(), item.getValue());
        }
    }
}