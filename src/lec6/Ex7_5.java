package lec6;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * Перебір, фільтрація і відображення
 */
public class Ex7_5 {
    public static void main(String[] args) {

        //Створюємо список
        List<Person> persons = new ArrayList<>(5);

        //Заповнюємо його
        persons.add(new Person("Дмитро", "Гулак-Травін"));
        persons.add(new Person("Артем", "Гуcак"));
        persons.add(new Person("Галина", "Рудченко"));
        persons.add(new Person("Павло", "Дудар"));
        persons.add(new Person("Артем", "Семиніжка"));

        //Зберігаєм стрім в списку
        List list = persons.stream()
                .filter(s -> s.getName().equals("Артем"))//Фільтрація
                .map(s->s.getSurname().toUpperCase(Locale.ROOT))//Відображення
                .collect(Collectors.toList());//Формування списку

        //Відображаєм список
        System.out.println("Відібрано: " + list);
    }
}
