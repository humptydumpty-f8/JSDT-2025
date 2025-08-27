package lec3;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/**
 * Приклад використання \r для створення анімаційного ефекту
 */
public class Ex1_4 {

    public static void main(String[] args) throws InterruptedException {
        // 10 циклів анімації
        for (int i=0;i<10;i++) {
            for (String s : Arrays.asList(".","..", "...")) {
                TimeUnit.SECONDS.sleep(1);//Затримка 1 сек
                System.out.print('\r');
                System.out.print(s);
            }
        }
    }
}
