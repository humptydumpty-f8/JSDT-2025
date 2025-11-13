package lec10;

/**
 * Вкладений внутрішній клас RecordBook
 */
class Student {
    private String fullName;//повне імя
    private String group;//код групи

    public Student(String fullName, String group) {
        this.fullName = fullName;
        this.group = group;
    }

    //Внутрішній клас залікової книжки
    class RecordBook {
        private int number;//номер заліковки

        public RecordBook(int number) {
            this.number = number;
        }

        public void print() {//друк заліковки
            System.out.printf("%s \t %s \t %d %n", Student.this.fullName, group, number);
        }
    }
}

public class Ex4_1 {


    public static void main(String[] args) {

        //Можливий спосіб створення екземпляру внутрішнього класу
        Student.RecordBook rbookPupkin = new Student("Pupkin","TP-10"). new RecordBook(10101010);

        //Рекомендований спосіб створення екземпляру внутрішнього класу
        Student std = new Student("Gupkin", "TP-12");
        Student.RecordBook rbookGupkin = std.new RecordBook(12121212);

        //Друк заліковок
        rbookPupkin.print(); //"Pupkin 	 TІ-01 	 1111111"
        rbookGupkin.print(); //"Gupkin 	 TІ-02 	 22222222"
    }
}
