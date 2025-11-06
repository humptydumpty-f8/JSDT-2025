package lec6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Використання методів класу Collections
 */
public class Ex8_1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println("Стартова колекція: " + numbers);//відображення колекції

        //Створення копії
        List<Integer> duplicate = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1));
        Collections.copy(duplicate, numbers);
        System.out.println("Копія колекції: " + duplicate);

        //"Перемішана" колекція
        Collections.shuffle(duplicate);
        System.out.println("\"Перемішана\" колекція: " + duplicate);

        //Найменший і найбільший елементи
        System.out.println("Найменший елемент: " + Collections.min(duplicate));
        System.out.println("Найбільший елемент: " + Collections.max(duplicate));

        //Сортування за зростанням і пошук
        Collections.sort(duplicate);
        System.out.println("Сортування за зростанням: " + duplicate);
        System.out.println("Результат пошуку елемента 1: " + Collections.binarySearch(duplicate, 1));
        System.out.println("Результат пошуку елемента 10: " + Collections.binarySearch(duplicate,10));

        //Сортування в оберненому порядку і пошук
        Collections.reverse(duplicate);
        System.out.println("Обернений порядок: " + duplicate);
        System.out.println("Результат пошуку елемента 1: " + Collections.binarySearch(duplicate, 1,Collections.reverseOrder()));
        System.out.println("Результат пошуку елемента 10: " + Collections.binarySearch(duplicate,10));

        //Заповнена елементом 10
        Collections.fill(duplicate,10);
        System.out.println("Заповнена елементом 10: " + duplicate);
    }
}
