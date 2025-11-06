package lec6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Сортування за механізмом, що визначений в компараторі
 */
public class Ex3_7 {
    public static void main(String[] args) {

        //Створюємо список
        List<Person> persons = new ArrayList<>(5);

        //Заповнюємо його
        persons.add(new Person("Дмитро","Гулак-Травін"));
        persons.add(new Person("Артем","Гусак"));
        persons.add(new Person("Галина","Рудченко"));
        persons.add(new Person("Павло","Дудар"));
        persons.add(new Person("Артем","Семиніжка"));

        //Сортуємо список з використанням компаратора
        Collections.sort(persons,new PersonSurnameComparator());

        //Виводимо відсортований список
        for (Person p:persons
             ) {
            System.out.println(p.toString());
        }

    }
}