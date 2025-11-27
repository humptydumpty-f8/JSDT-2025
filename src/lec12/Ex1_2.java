package lec12;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Додавання елементів в контейнер зза допомогою add з двома параметрами
 * для визначення порядку додавання
 */
public class Ex1_2 extends Frame {

    //Конструктор
    public Ex1_2(String title)  {
        super(title);
        setSize(300,200);
        setLocation(200,300);

        setLayout(new FlowLayout());//вибір менеджера розташування FlowLayout

        //#0 Додавання поля мітки
        Label label = new Label("Password:");
        add(label, 0);

        //#1 Додавання текстового поля
        TextField textField = new TextField("");
        add(textField, 1);

        //Додавання кнопки
        Button buttonOk = new Button("Ok");
        add(buttonOk,2);

        //#2 Додавання кнопки в кінець
        Button buttonClose = new Button("Close");
        add(buttonClose,-1);

        //Візуалізація форми
        setVisible(true);
    }

    public static void main(String[] args) {

        Frame frame = new Ex1_2("Main");//запуск додатку

        //Обробник кнопки закривання вікна
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
