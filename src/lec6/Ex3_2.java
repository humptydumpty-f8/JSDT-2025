package lec6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Сортування списків
 */
public class Ex3_2 {

    //Створюємо  список з використанням обгортки
    static List<Integer> numbers = new ArrayList<>(List.of(3, -5, 2, 4, 1));

    public static void main(String[] args) {

        //Виводимо вихідний список
        System.out.println("Original list:\n\t" + numbers);

        //Виконуємо сортування за зростанням і виводим список
        Collections.sort(numbers);
        System.out.println("Sorted ascending:\n\t" + numbers);

        //Виконуємо сортування за спаданням і виводим список
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted decending:\n\t" + numbers);

    }
}
