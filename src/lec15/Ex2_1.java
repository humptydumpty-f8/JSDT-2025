package lec15;
//Приклад з методом paramString()
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Візуалізація відомостей про обєкт події за допомогою paramString()
 */
public class Ex2_1 {
    public static void main(String[] args) {

        class ParamStringDemo  extends Frame implements ActionListener{
            private Button btn;
            private TextArea textArea;

            public ParamStringDemo (String title) {
                super(title);
                setSize(300, 200);
                setLocation(200, 300);

                //Джерело події
                btn = new Button("Press me!");
                btn.addActionListener( this);
                add(btn,BorderLayout.SOUTH);

                //Текстове поле для відображення параметрів події
                textArea = new TextArea();
                add(textArea,BorderLayout.CENTER);
                textArea.setEditable(false);

//                pack();
                setVisible(true);

                addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                });
            }

            //Метод з paramString
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(e.paramString());
            }
        }
        new ParamStringDemo("ParamStringDemo");
    }
}
