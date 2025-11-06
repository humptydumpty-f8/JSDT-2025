package lec6;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Стек із застосуванням ArrayDeque
 */
public class Ex5_3 {
    public static void main(String[] args) {

        //Створюємо стек
        Deque<Person> persons = new ArrayDeque<>(6);

        //Заповнюємо його
        persons.push(new Person("Дмитро","Гулак-Травін"));
        persons.push(new Person("Артем","Гусак"));
        persons.push(new Person("Галина","Рудченко"));
        persons.push(new Person("Павло","Дудар"));
        persons.push(new Person("Артем","Семиніжка"));

        //Вилучаємо зі стеку
        for (Person p:persons) {
            System.out.println(persons.pop());
        }
    }
}