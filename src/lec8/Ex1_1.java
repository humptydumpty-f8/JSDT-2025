package lec8;

/**
 * Використання повного імені класу
 */
public class Ex1_1 {
    public static void main(String[] args) {
        //Використання повного імені класу
        var student = new lec7.Student("Pupkin");
        student.getInfo();

        //Виклик статичного методу з класу в пакеті
        lec8.company.common.HelloWorld.say();
    }
}
