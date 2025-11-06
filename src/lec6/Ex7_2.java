package lec6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/**
 * Перебір, сортування, фільтрація і відображення
 */
public class Ex7_2 {
    public static void main(String[] args) {

        //Створюємо список
        List<Person> persons = new ArrayList<>(5);

        //Заповнюємо його
        persons.add(new Person("Дмитро", "Гулак-Травін"));
        persons.add(new Person("Артем", "Гуcак"));
        persons.add(new Person("Галина", "Рудченко"));
        persons.add(new Person("Павло", "Дудар"));
        persons.add(new Person("Артем", "Семиніжка"));

        persons.stream()
                .filter(s -> s.getName().equals("Артем"))//Фільтрація
                .sorted(new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o1.getSurname().compareTo(o2.getSurname());
                    }
                })
                .map(s->s.getSurname())//Відображення
                .forEach(s-> System.out.println(s.toUpperCase(Locale.ROOT)));//Перебір

    }
}
