package lec6;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import static java.util.List.*;

/**
 * Створення і використання лістітератора
 */
public class Ex3_5 {
    public static void main(String[] args) {

        //Створюємо  список
        List<Integer> numbers = new ArrayList<>(List.of(2, 4, 3, 1));

        //Створюємо лістітератор
        ListIterator listIterator = numbers.listIterator();

        System.out.print("ListIterator: ");
        //Перебераємо елементи колекції за допомогою лістітератора
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();

        listIterator.add(5);//Додаємо новий елемент в кінець списку
        listIterator.previous();//Повертаємось на попередню позицію
        listIterator.set(6);//Змінюємо значення
        listIterator.next();//Повертаємось на попередню позицію

        System.out.print("Revers: ");
        //Перебераємо елементи колекції в протилежному напрямку
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
        System.out.println();


        System.out.print("Foreach: ");
        //Перебераємо елементи колекції за допомогою циклу
        for (Integer i : numbers
        ) {
            System.out.print(i + " ");
        }
    }
}