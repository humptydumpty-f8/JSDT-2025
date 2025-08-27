package lec3;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Визначити, чи є всі елементи вихідного одновимірного масиву a негативними величинами,
 * чи вони всі позитивні або серед елементів a є як позитивні, так і негативні величини,
 * і вивести відповідні повідомлення для кожного випадку.
 */
public class Ex9_2 {
    double[] a;
    enum resume {allValuesAreNegative, allValuesArePositive, differentValues}    ;

    public double[] getA(String strArray) {
        String[] strElements = strArray.split(" ");

        a = new double[strElements.length];
        for (int i = 0; i < strElements.length; i++) {
            try {
                a[i] = Double.parseDouble(strElements[i]);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return a;
    }

    public resume getResume() {
        int negativeCounter = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 0) negativeCounter++;
        }
        if (negativeCounter == a.length) return resume.allValuesAreNegative;
        else if (negativeCounter == 0) return resume.allValuesArePositive;
        else return resume.differentValues;
    }

    public static void main(String[] args) {

        Ex9_2 task2 = new Ex9_2();
        String resultMessage;

        JOptionPane.showMessageDialog(null,
                "Визначити, чи є всі елементи вихідного одновимірного масиву a негативними величинами,\n " +
                        "чи вони всі позитивні або серед елементів a є як позитивні, так і негативні величини, \n" +
                        "і вивести відповідні повідомлення для кожного випадку.",
                "Task 2",
                JOptionPane.PLAIN_MESSAGE);

        String strArray = JOptionPane.showInputDialog(null,
                "Enter array elements:",
                "Array",
                JOptionPane.PLAIN_MESSAGE);

        if (strArray == null) System.exit(1);
        else task2.a = task2.getA(strArray);
        System.out.println("a[]=" + Arrays.toString(task2.a));

        resume result = task2.getResume();
        if (result == resume.allValuesAreNegative) resultMessage = "Всі елементи є негативними величинами";
        else if (result == resume.allValuesArePositive) resultMessage = "Всі елементи є позитивними величинами";
        else resultMessage = "Серед елементів a є як позитивні, так і негативні величини";

        JOptionPane.showMessageDialog(null,
                resultMessage,
                "a[]=", JOptionPane.INFORMATION_MESSAGE);
    }
}
