package lec6;

import java.util.ArrayList;
import java.util.List;

/**
 * Сортування в потоці у спосіб що передбачений в класі
 */
public class Ex7_3 {
    public static void main(String[] args) {

        //Створюємо список
        List<Person> persons = new ArrayList<>(6);

        //Заповнюємо його
        persons.add(new Person("Дмитро", "Гулак-Травін"));
        persons.add(new Person("Артем", "Гусак"));
        persons.add(new Person("Галина", "Рудченко"));
        persons.add(new Person("Павло", "Дудар"));
        persons.add(new Person("Артем", "Семиніжка"));

        persons.stream()
                .sorted()// Сортування у спосіб що передбачений в класі
                .forEach(s-> System.out.println(s));//Перебір
    }
}
