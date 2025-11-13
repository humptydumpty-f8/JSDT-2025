package lec8;

import lec7.Student;

import static lec8.company.common.HelloWorld.say;

/**
 * Імпорт класу з іншого пакету
 */
public class Ex1_2 {
    public static void main(String[] args) {
        //Використання імпортованого класу
        var student = new Student("Pupkin");
        student.getInfo();

        //Виклик статичного методу з класу в пакеті
        say();
    }
}
