package lec11;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Рекомендована структура графічного додатку:
 * 1. конструктор використовувати тільки для опису розташування компонентів вікна програми,
 * 2. методи (в т.ч. обробники подій) виноситимемо в клас вікна
 */
public class Ex1_3 extends Frame {

    //Конструктор з параметром
    public Ex1_3(final String title) {

        super(title);
        setSize(300, 200);//задаються розміри вікна
        setLocation(200, 300);//задається розташування вікна
        //Задається іконка вікна
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/lec11/Herald_of_NTUU_KPI_logo.svg.png"));

        //Створення елементів керування з точним розташуванням і розмірами

        setLayout(null);//відключається менеджер розкладок, щоб не заважав задавати розташування і розміри

        Label label = new Label("Hello AWT!");//створюється поле мітки
        label.setBounds(100, 50, 80, 30);//задається розташування і розміри мітки
        add(label);//мітка додається на форму

        Button button = new Button("Ok");//створюється кнопка з назвою
        button.setBounds(100, 100, 100, 50);//задається розташування і розміри кнопки
        add(button);//кнопка додається на форму

        setVisible(true);//форма візуалізується
    }

    public static void main(String[] args) {

        Frame frame = new Ex1_3("Ex1_3");//запуск додатку

        //Обробник кнопки закривання вікна
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
