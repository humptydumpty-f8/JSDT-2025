package lec8;


import java.util.Scanner;

/**
 * Імпорт класу Scanner з бібліотеки java
 */
public class Ex1_5 {
    public static void main(String[] args) {

      System.out.println("Enter text:");
      Scanner scanner = new Scanner(System.in);
      String text = scanner.nextLine();
      scanner.close();

      System.out.println("Entered text:");
      System.out.println(text);

    }
}
