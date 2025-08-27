package lec3;

import java.io.IOException;

/**
 * Метод System.in.read() здійснює зчитування 8 біт символа
 * Коректно обробляється тільки латиниця!
 */
public class Ex3_1 {
    public static void main(String[] args)  {

        System.out.println("Enter a symbol:");
        int x = 0;
        try {
            x = System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        char c = (char) x;
        System.out.println("Код символа " + c + " : " + x);

        /*Enter a symbol:
        ф
        Код символа: Ñ = 209*/
    }
}
