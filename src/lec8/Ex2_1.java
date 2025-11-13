package lec8;

/**
 * Роль модифікаторів доступу protected
 */
public class Ex2_1 {
    public static void main(String[] args) {

        /**
         * Батьківський клас
         */
        class Person {
            protected String name;
            protected int age;

            private Person() { }//необхідний для успадкування

            Person(String name, int age) {
                this.name = name;
                this.age = age;
            }
        }

        /**
         * Клас спадкоємця
         */
        class Student extends Person{
            protected  String almamater;

            public Student(String name, int age, String almamater) {
                super(name, age);
                this.almamater = almamater;
            }

            /**
             * Виводить відомості про екземпляр класу
             */
            public void print() {
                System.out.println("Student{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        ", almamater='" + almamater + '\'' +
                        '}');
            }
        }

        Student student = new Student("Pupkin",18,"KPI") ;

        student.print();
    }
}
