package lec3;

import java.util.Scanner;

/**
 * "Сканування" текстового рядка
 */
public class Ex5_2 {
    public static void main(String[] args) {
        String contents = "Hello World " +
                "Hello World!\n" +
                "Welcome to Java!";

        System.out.println(contents);
        System.out.println();

        try (Scanner scanner = new Scanner(contents)){
                do {
                System.out.println(scanner.next());
            }while (scanner.hasNextLine());
         }

    }
}
