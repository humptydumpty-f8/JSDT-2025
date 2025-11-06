package lec7;

public class Ex5_2 {

    record Person(String name, int age) {

        //Конструктор з обмеженнями
        Person {

            if (age < 16 || age > 110) {
                age = 18;
            }
        }

        //Власний конструктор
        Person(String firstName, String lastName, int age) {

            this(firstName + " " + lastName, age);

        }

        //Перевизначення toString()

        public String toString() {
            return String.format("Person %s, Age: %d", name, age);
        }
    }

    public static void main(String args[]) {

        Person tom = new Person("Tom", 3);

        System.out.println(tom.toString());     // Person Tom, Age: 18
        System.out.println(tom.name());     // Tom
        System.out.println(tom.age());      // 18
        System.out.println(tom.hashCode());

        Person bob = new Person("Bob", "Brown", 21);
        System.out.println(bob.toString());     // Person Bob Brown, Age: 21
        System.out.println(bob.hashCode());

        Person tomas = new Person("Tom", 3);
        System.out.println(tomas.toString());     // Person Tom, Age: 18

        System.out.println(tom.equals(bob));    // false
        System.out.println(tom.equals(tomas));  // true
    }
}
