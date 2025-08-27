package lec3;

import javax.swing.*;

public class Ex9_1 {
    public static void main(String[] args) {

        //Виведення стартового вікна
        JOptionPane.showMessageDialog(null,
                "Welcome to Java!",
                "Start message",
                JOptionPane.INFORMATION_MESSAGE);

        //Отримання імені користувача і вітання з ним
        String name = JOptionPane.showInputDialog(null,
                "Enter your name: ",
                "User name",
                JOptionPane.WARNING_MESSAGE);

            if (name != null) JOptionPane.showMessageDialog(null,
                    "Hello, " + name,
                    "Welcome",
                    JOptionPane.PLAIN_MESSAGE);
            else {
                JOptionPane.showMessageDialog(null,
                        "Name not set!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                System.exit(11);
            }
        //Завершення роботи з програмою
        int result = JOptionPane.showConfirmDialog(null,
                "End the program?",
                "Go out",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            JOptionPane.showMessageDialog(null, "The program is complete");
            System.exit(10);
        } else JOptionPane.showMessageDialog(null, "The program is not complete");
    }
}
