package lec7;

/**
 * Ініціалізація з використанням ініціалізатора, конструктора копіювання і "ініціалізації подвійної дужки"
 */
public class Ex2_2 {

    public static void main(String[] args) {

        Student st1 = new Student();
        st1.getInfo();//so-and-so 	 undefined

        Student st2 = new Student("Pupkin");
        st2.getInfo();//Pupkin 	 undefined

        Student st3 = new Student("Pupkin", "Tр-11");
        st3.getInfo();//Pupkin 	 Tр-11

        Student st4 = new Student(st3);//конструктор копіювання
        st4.getInfo();//Pupkin 	 Tр-11

//      Використання "ініціалізації подвійної дужки"
        Student st5 = new Student() {{
            this.setFullName("Brown");
            this.setGroup("ТР-22");
        }};
        st5.getInfo();//Brown 	 Tр-22
    }
}
