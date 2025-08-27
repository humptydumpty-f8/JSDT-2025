package lec3;

import java.io.IOException;
import java.util.Scanner;

/**
 * Коректне визначення коду натиснутої клавіші
 */

public class Ex4_3 {
    public static void main(String[] args) {
        boolean exit = true;
        String code = "";
        try (Scanner in = new Scanner(System.in)) {//створення сканеру
            do {
                System.out.print("Enter a symbol: \n");
                code = in.next();//зчитування текстового рядка
                System.out.printf("Code of %s is %d \n",
                        code.charAt(0),
                        (int) code.charAt(0));//виведення коду
                if (code.charAt(0) == 'q') exit = false;//вихід з циклу

            } while (exit);
        }
    }
}
