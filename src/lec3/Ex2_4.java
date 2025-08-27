package lec3;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Застосунок "Цифровий годинник"
 * Використовується застарілий специфікатор %tT
 */
public class Ex2_4 {
    public static void main(String[] args)  {

        // 10 циклів анімації
        for (int i=0;i++<10;) {
            System.out.printf("%tT", new Date() );
            try {
                TimeUnit.SECONDS.sleep(1);//Затримка 1 сек
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\r");
        }
    }
}
