package lec7;

import javax.swing.*;

/**
 * Клас з блоком ініціалізації
 */
public class Student {

    final String UNIVERSITY_NAME = "Igor Sikorsky Kyiv Polytechnic Institute";
    final String DEPARTMENT = "Institute of Nuclear and Thermal Energy";

    private String fullName;
    private String group;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    /*початок блоку ініціалізатора*/
    {
        JOptionPane.showMessageDialog(null,"Увага! Створений екземпляр класу Student");
        //System.out.println("Увага! Створений екземпляр класу Student:");
        fullName = "so-and-so";
        group = "undefined";
    }
    /*кінець блоку ініціалізатора*/

    public Student() {
    }

    public Student(String fullName) {
        this.fullName = fullName;
    }

    public Student(String fullName, String group) {
        this.fullName = fullName;
        this.group = group;
    }

//    Конструктор копіювання
    public Student(Student student){
        this(student.fullName,student.group);
    }

    public void getInfo() {

        System.out.printf("%S\t %S\n", fullName, group);
    }

    void printUnivName() {

        System.out.printf("%S", UNIVERSITY_NAME);
    }

    protected void finalize() throws Throwable {
        System.out.println(fullName + " destroyed");
    }

}
