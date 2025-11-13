package lec9;

/**
 * Перевантаження методу в успадкованому класі
 */
public class Ex3_3 {
    public static void main(String[] args) {

        /**
         * Батьківський клас
         */
        class Person {
            protected String name;
            protected int age;
            /**
             * Перевантажуваний метод
             */
            public void print() {
                System.out.println("Person{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}');
            }
        }

        /**
         * Клас спадкоємця
         */
        class Student extends Person{
            protected String almamater;
            /**
             * Перевантажений метод
             * @param almamater назва освітнього закладу
             */
            public void print(String almamater) {
                System.out.println("Student{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        ", almamater='" + almamater + '\'' +
                        '}');
            }
        }

        Student student = new Student() {{
            this.name="Pupkin";
            this.age=18;
        }};

        student.print();//виклик батьківського метода
        System.out.println();
        student.print("KPI");//виклик перевантаженого метода
    }
}
