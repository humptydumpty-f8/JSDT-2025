package lec6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Сортування за двома компараторами
 */
public class Ex3_8 {
    public static void main(String[] args) {

        Comparator<Person> pcomp = new PersonNameComparator().thenComparing(new PersonSurnameComparator());

        //Створюємо список
        List<Person> persons = new ArrayList<>();

        //Заповнюємо його
        persons.add(new Person("Дмитро","Гулак-Травін"));
        persons.add(new Person("Артем","Гусак"));
        persons.add(new Person("Галина","Рудченко"));
        persons.add(new Person("Павло","Дудар"));
        persons.add(new Person("Артем","Семиніжка"));

        //Сортуємо список з використанням компаратора
        Collections.sort(persons,pcomp);

        //Виводимо відсортований список
        for (Person p:persons
             ) {
            System.out.println(p.toString());
        }

    }
}