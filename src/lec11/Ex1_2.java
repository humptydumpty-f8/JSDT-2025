package lec11;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Формування основного вікна програми з допомогою конструктора
 */

//Наслідування класу Frame
public class Ex1_2 extends Frame {

    //Конструктор
    public Ex1_2()  {
        super("Ex1_2");
        setSize(300,300);
        setVisible(true);

        //Обробник кнопки закривання вікна
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {

        new Ex1_2();//запуск додатку
    }
}
