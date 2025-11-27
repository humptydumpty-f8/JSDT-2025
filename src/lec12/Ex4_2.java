package lec12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Використання діалогових вікон JOptionPane
 */
public class Ex4_2 {

    public static void main(String[] args) throws NumberFormatException {

        //Головне вікно програми
        class FrameDemo extends Frame {

            public FrameDemo() {
                super("DialogDemo");
                setSize(300, 200);
                setLocation(200, 300);

                Label lbl = new Label("Demo", Label.CENTER);
                add(lbl);
                setBackground(Color.darkGray);
                setForeground(Color.yellow);

                setVisible(true);
            }

        }

        //Сценарій роботи програми
        FrameDemo frame = new FrameDemo();//відкривання головного вікна

        //Інформаційне вікно
        JOptionPane.showMessageDialog(frame, "Using Dialog Boxes!", "Swing", JOptionPane.INFORMATION_MESSAGE);
        //Вікно введення
        String name = JOptionPane.showInputDialog("Your name: ");
        if (!name.matches("[a-zA-Z]*")) {
            //Вікно виведення
            JOptionPane.showMessageDialog(frame, "Value " + name + " is wrong!", "Error", JOptionPane.ERROR_MESSAGE);
            name = null;
        }

        //Вікно введення
        int age = Integer.parseInt(JOptionPane.showInputDialog("Your age: "));
        if (age <= 0 && age > 100) {
            //Вікно виведення
            JOptionPane.showMessageDialog(frame, "Value " + age + " is wrong!", "Error", JOptionPane.ERROR_MESSAGE);
            age = 0;
        }

        //Вікно підтвердження
        int res = JOptionPane.showConfirmDialog(frame, "name: " + name + " \nage: "+ age,"Entered data",  JOptionPane.OK_CANCEL_OPTION);

        if (res==0) System.out.println("OK");
        else System.out.println("Cansel");

        //Обробник події кліку по кнопці закриття головного вікна
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
