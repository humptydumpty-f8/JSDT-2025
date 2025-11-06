package lec6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Упорядкування в множинах
 */
public class Ex4_1 {
    public static void main(String[] args) {

        //Створюємо незмінну множину
        Set<Person> persons = Set.of(
                new Person("Галина","Рудченко"),
                new Person("Дмитро","Гулак-Травін"),
                new Person("Артем","Гусак"),
                new Person("Павло","Дудар"),
                new Person("Артем","Семиніжка")
                );

        //Створюємо змінні множини різних видів
        Set<Person> numbersHashSet = new HashSet<>(persons);
         Set<Person> numbersLinkedHashSet = new LinkedHashSet<>(persons);
         Set<Person> numbersTreeSet = new TreeSet<>(persons);

         //Реалізуєм TreeSet з власним компаратором
        Set<Person> numbersTreeSetComparator = new TreeSet<>(new PersonNameComparator());
        numbersTreeSetComparator.addAll(persons);

        //Виводимо множини

        //Власний порядок сортування
        System.out.println("\nHashSet:");
        for (Person p:numbersHashSet
             ) {
            System.out.println(p.toString());
        }

        //   System.out.println(numbersHashSet);

        //Сортування в порядку додавання в колекцію
        System.out.println("\nLinkedHashSet:");
        for (Person p:numbersLinkedHashSet
             ) {
            System.out.println(p.toString());
        }

//        System.out.println(numbersLinkedHashSet);

        //Сортування визначене в класі
        System.out.println("\nTreeSet:");
        for (Person p:numbersTreeSet
             ) {
            System.out.println(p.toString());
        }
//        System.out.println(numbersTreeSet);

        //Сортування з використанням компаратора
        System.out.println("\nTreeSet+Comparator:");
        for (Person p:numbersTreeSetComparator
             ) {
            System.out.println(p.toString());
        }
//        System.out.println(numbersTreeSetComparator);

    }
}