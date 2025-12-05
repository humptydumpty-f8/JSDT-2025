package lec13;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Менеджер CardLayout для компоновки вікна
 */
public class Ex2_1 {
    public static void main(String[] args) {

        //Внутрішній клас методу
        class CardLayoutDemo extends Frame {
            CardLayout cardLayout;

            //Конструктор
            public CardLayoutDemo(String title) {
                super(title);
                setSize(300, 200);
                setLocation(200, 300);

                //Установка CardLayout і додавання компонентів
                cardLayout = new CardLayout(10, 20);
                setLayout(cardLayout);
                add(new Button("Українська сторінка"), "page1");
                add(new Button("English page"), "page2");
                add(new Button("Deutsche Seite"), "pageЗ");

                //Довільний доступ
                cardLayout.show(this, "page2"); //початкова сторінка - "English page"

                setVisible(true);//візуалізація форми

                //Обробник для закривання форми
                addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                });
            }
        }

        //Сценарій роботи
        CardLayoutDemo cardLayoutDemo = new CardLayoutDemo("CardLayoutDemo");//відкри форму з початковою сторінкою ("English page")

        //Демонстрація з затримкою наступної, попередньої, останньої і першої сторінок
        try {
            Thread.sleep(3 * 1000);
            cardLayoutDemo.cardLayout.previous(cardLayoutDemo);//попередня сторінка ("Українська сторінка")
            Thread.sleep(3 * 1000);
            cardLayoutDemo.cardLayout.next(cardLayoutDemo);//наступна сторінка ("English page")
            Thread.sleep(5 * 1000);
            cardLayoutDemo.cardLayout.last(cardLayoutDemo);//остання сторінка ("Deutsche Seite")
            Thread.sleep(5 * 1000);
            cardLayoutDemo.cardLayout.first(cardLayoutDemo);//перша сторінка ("Українська сторінка")
        } catch (InterruptedException e) {
        }

    }
}
