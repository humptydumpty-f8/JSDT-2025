package lec6;

import java.util.ArrayList;
import java.util.List;

/**
 * Типові методи роботи з списками ArrayList
 */
public class Ex3_1 {
    public static void main(String[] args) {

        //Створюємо незмінний список
        List<String> num = List.of("one", "two", "three");

        //Створюємо змінний список з незмінного
        List<String> numbers = new ArrayList<>(num);

        //Додаєм елемент
        numbers.add("four");
        //Додаєм елемент по индексу 0
        numbers.add(0, "zero");

        //Виводим список елементів
        System.out.println("ArrayList: " + numbers);

        //Обходимо список
        System.out.println("numbers:");
        for (String el : numbers) {
            System.out.println("\t" + el);
        }

        //Виводимо розмір списку
        System.out.println("Size: " + numbers.size());

        //Отримуємо 5-й елемент
        System.out.printf("numbers[4] = %s\n", numbers.get(4));
        //Задаємо новое значення
        numbers.set(4, "five");
        //Отримуємо 5-й елемент
        System.out.printf("numbers[4] = %s\n", numbers.get(4));

        //Перевіряємо наявність
        System.out.printf("contains \"five\" %b\n", numbers.contains("five"));
        System.out.printf("contains \"four\" %b\n", numbers.contains("four"));
        System.out.printf("index of \"five\" is %d\n", numbers.indexOf("five"));

        //Видаляємо елемент з індексом 4
        numbers.remove(4);

        //Виводимо новий список елементів
        System.out.println(numbers);
    }
}
