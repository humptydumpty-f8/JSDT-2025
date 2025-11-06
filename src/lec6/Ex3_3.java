package lec6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Альтернативний спосіб зміни порядку сортування
 */
public class Ex3_3 {

    //Створюємо  список
    static List<String> numbers = new ArrayList<>(List.of("3", "5", "2", "4", "1"));

    public static void main(String[] args) {

        //Виводимо вихідний список
        System.out.println("Original list:\n\t" + numbers);

        //Виконуємо сортування за зростанням і виводим список
        Collections.sort(numbers);
        System.out.println("Sorted ascending:\n\t" + numbers);

        //Змиінюємо порядок сортування на спадання і виводим список
        Collections.reverse(numbers);
        System.out.println("Sorted decending:\n\t" + numbers);

        //Повторно змиінюємо порядок сортування на зростанням і виводим список
        Collections.reverse(numbers);
        System.out.println("Sorted ascending:\n\t" + numbers);
    }
}