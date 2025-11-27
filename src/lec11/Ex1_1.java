package lec11;

/**
 * Формування основного вікна програми в методі main
 */

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Наслідування класу Frame
public class Ex1_1 extends Frame {

    public static void main(String[] args) {

        Frame fr = new Ex1_1();//створення вікна
        fr.setTitle("Ex1_1");// заголовок вікна
        fr.setSize(300,300);//визначення розмірів вікна
        fr.setVisible(true);//візуалізація вікна


        //Обробник кнопки закривання вікна
       fr.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
