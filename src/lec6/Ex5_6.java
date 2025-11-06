package lec6;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Черга з пріоритетами на основі компаратора
 */
public class Ex5_6 {
    public static void main(String[] args) {

        // Створюємо чергу з пріоритетами, що визначаються компаратором
        Queue<Person> persons = new PriorityQueue<>(new PersonSurnameComparator());

        // Додаємо об'єкти класу Person
        persons.add(new Person("Дмитро","Гулак-Травін"));
        persons.add(new Person("Артем","Гуcак"));
        persons.add(new Person("Галина","Рудченко"));
        persons.add(new Person("Павло","Дудар"));
        persons.add(new Person("Артем","Семиніжка"));

        // Обробляємо елементи у відповідності з порядком сортування
        while (!persons.isEmpty ()) {
            System.out.println (persons.remove ());
        }
    }
}