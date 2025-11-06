package lec6;
//Завдання з лабораторного практикума!
//Створити застосунок для додавання абонентів і перегляду списку абонентів телефонної мережі.
// Початкові записи в списку (5 записів) створюються в програмному коді і є об'єктами класу TreeMap,
// де ключем є семизначний номер телефону (типу Integer), а значенням - об'єкт Abonent, що містить
// три значення типу String: прізвище, ім'я та адреса. Передбачити можливість сортування елементів колекції по 2-3 полях.

import java.util.*;

public class Ex7_6 {

    public static class Abonent {
        String name, surname, addres;

        public Abonent(String name, String surname, String addres) {
            this.name = name;
            this.surname = surname;
            this.addres = addres;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        public String getAddres() {
            return addres;
        }

        @Override
        public String toString() {
            return "Abonent{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", addres='" + addres + '\'' +
                    '}';
        }
    }

    public static class NameComparator implements Comparator<Abonent> {
        @Override
        public int compare(Abonent o1, Abonent o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static class SurnameComparator implements Comparator<Abonent> {
        @Override
        public int compare(Abonent o1, Abonent o2) {
            return o1.getSurname().compareTo(o2.getSurname());
        }
    }

    public static class AddresComparator implements Comparator<Abonent> {
        @Override
        public int compare(Abonent o1, Abonent o2) {
            return o1.getAddres().compareTo(o2.getAddres());
        }
    }

    public static void main(String[] args) {

        Map<Integer, Abonent> abonents = new TreeMap<>();

        abonents.put(7336030, new Abonent("Anna", "Sokolova", "Kyiv"));
        abonents.put(6438967, new Abonent("Volodymer", "Sokol", "Kyiv"));
        abonents.put(2546747, new Abonent("Nadiya", "Fedorchuk", "Odessa"));
        abonents.put(5876960, new Abonent("Anna", "Sokol", "Kyiv"));
        abonents.put(4563883, new Abonent("Nadiya", "Duman", "Odessa"));
        abonents.put(8787909, new Abonent("Anna", "Rak", "Kyiv"));

        System.out.println("TreeMap:");
        for (Integer i : abonents.keySet()
        ) {
            System.out.println(i + "\t" + abonents.get(i).toString());
        }

        List<Abonent> orderedAbonents = new ArrayList<>(abonents.values());
        orderedAbonents.sort(new AddresComparator().thenComparing(new NameComparator().thenComparing(new SurnameComparator())));

        System.out.println("\nOrdered List:");
        for (Abonent a : orderedAbonents
        ) {
            System.out.println("\n" + a);
            for (Integer key : abonents.keySet()
            ) {
                if (abonents.get(key).equals(a)) System.out.println(key);
            }
        }

        System.out.println("\nAbonents from Kyiv:");
        orderedAbonents.stream()
                .filter(s -> s.addres.equals("Kyiv"))
                .sorted(new SurnameComparator())
                .forEach(s -> System.out.println("\t" + s.surname.toUpperCase(Locale.ROOT) + " " + s.name));
    }
}
