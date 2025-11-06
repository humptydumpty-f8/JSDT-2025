package lec7;

public class Ex4_1 {

    public static void main(String[] args) {
        StudentV1.printUnivName(); //static method
        System.out.println(StudentV1.UNIVERSITY_NAME);//static const

        StudentV1 st1 = new StudentV1();
        st1.getInfo();// so-and-so 	 undefined 	 11

        System.out.println(st1.UNIVERSITY_NAME);
        System.out.println(st1.DEPARTMENT);

        StudentV1.counter = 20;

        StudentV1 st2 = new StudentV1();
        st2.getInfo();//so-and-so 	 undefined 	 21

        StudentV1 st3 = new StudentV1();
        st3.getInfo();//so-and-so 	 undefined 	 22

    }
}
