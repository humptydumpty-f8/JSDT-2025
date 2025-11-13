package lec9;

/**
 * Фіналізація методу та класу
 */
public class Ex4_1 {
    public static void main(String[] args) {

        class А {

            //Фіналізований метод
            final void meth() {
                System.out.println(" Це фіналізований метод. ");
            }
        }

        //Фіналізований клас
        final class В extends А {
            // Цей метод не може перевизначатись
            //void meth ( ) {System.out.println ( " Помилка! " ) ;
        }

        //Клас B не може мати підкласи
        //class C extends В {}
    }
}
