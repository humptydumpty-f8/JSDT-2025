package lec12;

import java.awt.*;

/**
 * Екранна заставка
 */
public class Ex2_2 extends Frame {

    //Конструктор вікна
    public Ex2_2(String title) {
        super(title);
        setSize(300, 200);
        setLocation(200, 300);
        setVisible(true);
    }

    // Клас заставки успадковується від Window
    static class SplashScreenDemo extends Window {

        // Конструктор заставки
        public SplashScreenDemo() {
            super(new Frame());//виклик батьківського конструктора
            setBackground(new Color(0, 255, 150));//колір фону
            setSize(300, 200);//розміри
            setLocation(200, 300);//розташування

            //Створення компонентів заставки
            Label lbl1 = new Label("____________", Label.CENTER);
            Label lbl2 = new Label("Splash Demo", Label.CENTER);
            Label lbl3 = new Label("____________", Label.CENTER);

            //Додавання компонентів заставки в контейнер
            add("North",lbl1);
            add("Center",lbl2);
            add("South",lbl3);

            setVisible(true);//зробити видимою
        }
    }

    public static void main(String[] args) {

        // Створення батьківського фрейму
        Frame frame = new Ex2_1("Simple Window");

        // Відображаємо заставку
        SplashScreenDemo splash = new SplashScreenDemo();

        try {
            Thread.sleep(5 * 1000);//демонстркємо 5 сек
        } catch (InterruptedException e) {
        }

        // Вимикаємо заставку
        splash.setVisible(false);
        splash.dispose();

        try {
            Thread.sleep(5 * 1000);//демонстркємо 5 сек
        } catch (InterruptedException e) {
        }

        //Завершуємо роботу додатку
        System.exit(0);
    }
}
