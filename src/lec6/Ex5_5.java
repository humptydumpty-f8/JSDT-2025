package lec6;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Черга з пріоритетами на основі "внутрішнього" порядку сортування
 */
public class Ex5_5 {
    public static void main(String[] args) {

        // Створюємо чергу з пріоритетами
        Queue<Person> persons = new PriorityQueue<>();

        // Додаємо об'єкти класу Person з "внутрішнім" порядком сортування
        persons.offer(new Person("Дмитро","Гулак-Травін"));
        persons.offer(new Person("Артем","Гусак"));
        persons.offer(new Person("Галина","Рудченко"));
        persons.offer(new Person("Павло","Дудар"));
        persons.offer(new Person("Артем","Семиніжка"));

        // Обробляємо елементи у відповідності з порядком сортування
        while (!persons.isEmpty ()) {
            System.out.println (persons.remove ());
        }
    }
}