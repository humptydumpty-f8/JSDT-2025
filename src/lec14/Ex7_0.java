package lec14;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Компоненти TextField і TextArea
 * Текст, що вводться в TextField, після натиснення Enter додається в TextArea
 */
public class Ex7_0 {

    /**
     * Клас містить статичне поле buffer і тому не може використовуватись як вкладений клас в main().
     * Тому він використовується як статичний вкладений клас
     */
    static class TextFieldDemo extends Frame {
        static String buffer = "Мої завдання:\n";

        public TextFieldDemo(String title) {
            super(title);
            setSize(300, 200);
            setLocation(200, 300);

            //Створення поля введення
            TextField textField = new TextField(10);
            textField.setText(">");//запрошення на введення
            textField.setSelectionStart(2);//переміщуєм курсор за >

            //Створення області задач
            TextArea textArea = new TextArea(10, 5);
            textArea.setText(buffer);
            textArea.setEditable(false);//забороняєм редагування

            add(textField, "North");
            add(textArea, "Center");

//            pack();
            setVisible(true);

            //Обробник натиснення клавіші Enter
            textField.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    buffer += textField.getText() + "\n";
                    textArea.setText(buffer);
                    textField.setText(">");
                    textField.setSelectionStart(2);
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


    public static void main(String[] args) {
        //Сценарій роботи
        new TextFieldDemo("My tasks");
    }
}
