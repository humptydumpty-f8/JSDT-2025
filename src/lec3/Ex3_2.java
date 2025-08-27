package lec3;

import java.io.IOException;

/**
 * Використання System.in.read() в циклі
 * Супроводжується артефактом Enter a symbol: Code: 10
 */

public class Ex3_2 {
    public static void main(String[] args) {

        boolean quit = true;
        int c = 0;
        do {
            System.out.print("Enter a symbol: ");
            try {
                c = System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Code: " + c);

            if (c == 'q') quit = false;//вихід при натисненні клавіші 'q'
        } while (quit);

       /* Enter a symbol: r
        Code: 114
        Enter a symbol: Code: 10 //артефакт*/
    }
}
