package lec6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Створення і використання ітератора
 */
public class Ex3_4 {
    public static void main(String[] args) {

        //Створюємо список
        Set<Integer> numbers = new HashSet<>(Arrays.asList(2, 5, 8, 1));

        //Створюємо ітератор
        Iterator iterator = numbers.iterator();

        System.out.println("Iterator:");
        //Перебераємо елементи колекції за допомогою ітератора
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        System.out.println("Foreach:");
        //Перебераємо елементи колекції за допомогою циклу
        for (Integer i:numbers
             ) {
            System.out.print(i + " ");
        }
    }
}