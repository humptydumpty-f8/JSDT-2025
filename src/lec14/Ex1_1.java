package lec14;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Компонент Label: основні можливості
 * Колір тексту і фону спадкується від Component
 */
public class Ex1_1 {
    public static void main(String[] args) {

        class LabelDemo extends Frame {

            public LabelDemo(String title) {
                super(title);
                setSize(300, 200);
                setLocation(200, 300);

                //Створення таблиці 3х1 для розміщення міток
                GridLayout gridLayout = new GridLayout();
                gridLayout.setColumns(1);
                gridLayout.setRows(3);
                gridLayout.setVgap(10);
                gridLayout.setHgap(20);
                setLayout(gridLayout);

                //Створення мітки конструктором без параметрів
                Label labelUp = new Label();
                labelUp.setText("Виберіть новий заголовок вікна:");//установка тексту
                labelUp.setAlignment(Label.CENTER);//центрування тексту
                labelUp.setForeground(new Color(0, 0, 255));//колір тексту

                //Створення мітки конструктором з одним параметром
                Label labelCenter = new Label("Заголовок");
                labelCenter.setAlignment(Label.LEFT);//вирівнювання по лівому краю
                labelCenter.setBackground(new Color(255, 255, 0));//колір фону

                //Створення мітки конструктором з двома параметрами
                Label labelBottom = new Label("Title", Label.LEFT);
                labelBottom.setBackground(new Color(255, 255, 0));//колір фону

                //Розміщення міток в таблиці
                add(labelUp);
                add(labelCenter);
                add(labelBottom);

                //pack();//упаковка компонентів

                setVisible(true);//візуалізація форми

                // Обробники подій
                labelCenter.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        setTitle(labelCenter.getText());
                    }


                    @Override
                    public void mousePressed(MouseEvent e) {

                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {

                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {

                    }

                    @Override
                    public void mouseExited(MouseEvent e) {

                    }
                });

                labelBottom.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        setTitle(labelBottom.getText());
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {

                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {

                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {

                    }

                    @Override
                    public void mouseExited(MouseEvent e) {

                    }
                });
                //Обробник кнопки закривання форми
                addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                });
            }
        }

        //Сценарій роботи
        new LabelDemo("LabelDemo");//відкрити форму
    }
}
