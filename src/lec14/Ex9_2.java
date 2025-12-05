package lec14;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Рисування графічних примітивів на холсті Canvas
 * з обробником події
 */
public class Ex9_2 {

    public static void main(String[] args) {

        // Вкладений клас методу, який успадковує клас Canvas для створення холсту
        class MyCanvas extends Canvas {
            // конструктор класу
            public MyCanvas() {
                setBackground(Color.GRAY);
                setSize(300, 200);
            }

            // пустий метод paint() для рисування всередині полотна
            public void paint(Graphics g) {
            }

        }

        //Формування головного вікна програми
        class CanvasDemo extends Frame {
            public CanvasDemo(String title) {
                super(title);
                setSize(300, 200);
                setLocation(200, 300);

                MyCanvas canvas = new MyCanvas();
                // обробник події
                canvas.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        Graphics g = canvas.getGraphics();
                        g.setColor(Color.red);

                        // отримати положення X і Y
                        int x, y;
                        x = e.getX();
                        y = e.getY();

                        // малюєм зафарбоване коло у точці кліку миші
                        g.fillOval(x, y, 15, 15);
                    }
                });

                add(canvas);
//                pack();
                setVisible(true);

            }
        }

        //Сценарій роботи
        CanvasDemo canvasDemo = new CanvasDemo("CanvasDemo");

        canvasDemo.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


    }
}
