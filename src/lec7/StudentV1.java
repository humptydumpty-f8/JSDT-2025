package lec7;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/**
 * Клас як тип і модуль одночасно
 */
public class StudentV1 {
    final static String UNIVERSITY_NAME="Igor Sikorsky Kyiv Polytechnic Institute";
    final  String DEPARTMENT="Institute of Nuclear and Thermal Energy";

    String fullName;
    String group;
    static int counter;

    /*початок блоку ініціалізатора*/
    {
        System.out.println("\n\tУвага! Створюється екземпляр Student #" + (counter+1));
        // 5 циклів анімації
        for (int i=0;i<5;i++) {
            for (String s : Arrays.asList(".","..", "...")) {
                try {
                    TimeUnit.SECONDS.sleep(1);//Затримка 1 сек
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print('\r');
                System.out.print(s);
            }
        }
        fullName = "so-and-so";
        group = "undefined";
    }
    /*кінець блоку ініціалізатора*/

    /*початок блоку статичного ініціалізатора*/
    static{
        System.out.println("\tУвага! Встановлено початкове значення лічільника!");
        counter = 10;
        }
    /*кінець блоку статичного ініціалізатора*/


    StudentV1(){
        ++counter;
    }
    StudentV1(String fullName){
        this.fullName=fullName;
        ++counter;
    }

    StudentV1(String fullName, String group){
        this.fullName=fullName;
        this.group=group;
        ++counter;
    }
    void getInfo(){

        System.out.printf("%s \t %s \t %d \n", fullName,group,counter);
    }
    static void printUnivName(){

        System.out.printf("%s%n", UNIVERSITY_NAME);
    }

    protected void finalize() throws Throwable
    {
        System.out.println(fullName + " destroyed");
    }

}
