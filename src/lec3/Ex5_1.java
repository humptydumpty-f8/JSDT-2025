package lec3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

import java.util.Scanner;


/**
 * Введення даних в файл з використанням PrintStream
 * Виведення даних з файлу з використанням Scanner
 */
public class Ex5_1 {
    public static void main(String[] args)  {

        //Введення даних
        try (PrintStream printStream = new PrintStream("src/lec3/demoPrintStream.txt")) {
            printStream.print("Hello World!\n");
            printStream.println("Welcome to Java!");
            printStream.printf("Name: %s Age: %d \n", "Bender", 33);

            System.out.println("The file has been written!!!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //Виведення даних
        System.out.println("\nFile contents:");
        File file = new File("src/lec3/demoPrintStream.txt");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) System.out.println(scanner.nextLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

