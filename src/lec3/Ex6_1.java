package lec3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Запис/читання текстового файла за допомогою FileWriter і FileReader
 */
public class Ex6_1 {
    public static void main(String[] args) {

        //Запис в текстовий файл
        String contents = "Hello World " +
                "Hello World!\n" +
                "Welcome to Java!";

        try (FileWriter writer = new FileWriter("src/lec3/demoPrintStream.txt")) {
            writer.write(contents);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Recording to the file is complete!\n");

        System.out.println("File contents:");
        //Читання з текстового файлу
        try (FileReader reader = new FileReader("src/lec3/demoPrintStream.txt");
             Scanner scan = new Scanner(reader)) {
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
