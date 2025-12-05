package lec14;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * Рисування графічних примітивів на холсті Canvas
 */
public class Ex9_1 {
    public static void main(String[] args) {

        // Вкладений клас методу, який успадковує клас Canvas для створення холсту
        class MyCanvas extends Canvas {
            // конструктор класу
            public MyCanvas() {
                setBackground(Color.GRAY);
                setSize(300, 200);
            }

            // метод paint() для рисування всередині полотна
            public void paint(Graphics g) {

                // додавання специфікацій
                try {
                    BufferedImage image = ImageIO.read(new File("src/lec11/Herald_of_NTUU_KPI_logo.svg.png"));
                    g.drawImage(image,0,0,50,90,null);
                }catch (Exception e){}


                g.setColor(Color.yellow);
                g.fillOval(75, 75, 150, 75);

                g.setColor(Color.blue);
                g.setFont(new Font("Arial",Font.BOLD,18));
                g.drawString("Glory to Ukraine!",75,120);
            }
        }

        //Формування головного вікна програми
        class CanvasDemo extends Frame {
            public CanvasDemo(String title) {
                super(title);
                setSize(300, 200);
                setLocation(200, 300);
                add(new MyCanvas());
                pack();
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
