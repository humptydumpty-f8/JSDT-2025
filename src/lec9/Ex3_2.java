package lec9;

/**
 * Динамічний поліморфізм (перевизначення методів)
 */
public class Ex3_2 {

    public static void main(String[] args) {

        //Батьківський клас
        class A {
            A(){}
            void start(){
                System.out.println("Start from A");
            }
        }

        //Клас-нащадок
        class B extends A {
            B(){super();}
            //Перевизначення методу
            @Override
            void start() {
                System.out.println("Start from B");
            }
        }


        B objB = new B();
        //Виклик перевизначеного методу
        objB.start();//"Start from B"

    }
}
