package lec10;

/**
 * Внутрішній клас локального методу
 */

//Зовнішній клас
class Student_new {
    String fullName;
    String group;

    public Student_new(String fullName, String group) {
        this.fullName = fullName;
        this.group = group;
    }

    //Локальний метод
    void showInfo(int number) {

        //Внутрішній клас локального методу
        class RecordBook {
            int number;

            void print() {
                System.out.printf("%s \t %s \t %d",
                        Student_new.this.fullName,
                        group, number);
            }
        }

        RecordBook rb = new RecordBook();
        rb.number = number;
        rb.print();
    }
}

public class Ex5_1 {
    public static void main(String[] args) {

        Student_new student = new Student_new("Bupkin", "TP-10");
        student.showInfo(10101010);
    }
}
