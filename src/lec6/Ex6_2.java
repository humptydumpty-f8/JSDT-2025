package lec6;

import java.util.Map;
import java.util.TreeMap;

/**
 *Перебір елементів словника обєктів
 */
public class Ex6_2 {

    static class Abonent {
        String name, surname, adress;

        public Abonent(String name, String surname, String adress) {
            this.name = name;
            this.surname = surname;
            this.adress = adress;
        }

        @Override
        public String toString() {
            return "Abonent{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", adress='" + adress + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {

        Map<Integer, Abonent> abonentMap = new TreeMap<>();
        abonentMap.put(7336030, new Abonent("Ostap", "Bender", "Kyiv"));
        abonentMap.put(2123593, new Abonent("Ipolit", "Vorobjaninov", "Odessa"));
        abonentMap.put(6033478, new Abonent("Oleksandr", "Balaganov", "Zhmerinka"));

        System.out.println("Словник :" + abonentMap);
        System.out.println();

        System.out.println("\tПеребор всіх елементів без використання об'єктів Map.Entry <K, V>");
        for (Integer tel : abonentMap.keySet()) {
            System.out.println(tel + "\t" + abonentMap.get(tel).toString());
        }
        System.out.println();

        System.out.println("\tПеребор всіх елементів у вигляді об'єктів Map.Entry <K, V>");
        for (Map.Entry<Integer, Abonent> item : abonentMap.entrySet()) {

            System.out.printf("Key:%d Value:%s %n", item.getKey(), item.getValue());
        }
    }
}
