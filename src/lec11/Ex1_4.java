package lec11;

import java.applet.Applet;
import java.awt.*;

/**
 * Перетворення вікна з попереднього приклада в аплет
 */
public class Ex1_4 extends Applet {
    public void init() {
        //Створення елементів керування з точним розташуванням і розмірами

        setLayout(null);//відключається менеджер розкладок, щоб не заважав задавати розташування і розміри

        Label label = new Label("Hello AWT!");//створюється поле мітки
        label.setBounds(100, 50, 80, 30);//задається розташування і розміри мітки
        add(label);//мітка додається на форму

        Button button = new Button("Ok");//створюється кнопка з назвою
        button.setBounds(100, 100, 100, 50);//задається розташування і розміри кнопки
        add(button);//кнопка додається на форму
    }
}





