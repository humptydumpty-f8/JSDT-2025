package lec12;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Контейнер Window в емуляції спливаючої підказки
 */
public class Ex2_1 extends Frame {

    //Конструктор
    public Ex2_1(String title) {
        super(title);
        setSize(300, 200);
        setLocation(200, 300);
        setVisible(true);
    }

    public static void main(String[] args) throws InterruptedException {

        // Створення батьківського фрейму
        Frame frame = new Ex2_1("Container Window");

        //Створення контейнеру Window
        Window w = new Window(frame);
        w.setSize(100, 50);
        w.setLocation(400, 400);
        w.toFront();//на передній план
        w.setBackground(Color.YELLOW);//колір фону
        Label label=new Label("Window",Label.CENTER);
        w.add(label);


        frame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                w.setVisible(true);//візуалізувати (альтернатива застарілому show)
                // w.show();
                System.out.println("Window is showing: " + w.isShowing());//стан видимості

            }

            @Override
            public void mouseExited(MouseEvent e) {
                w.setVisible(false);//приховати
                System.out.println("Window is showing: " + w.isShowing());//стан видимості

                w.dispose();
            }
        });


        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
