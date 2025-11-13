package lec9;

/**
 * Розширення та звуження типу
 */
public class Ex2_2 {

    public static void main(String[] args) {

        //Батьківський клас
        class Parent {
            Parent(){}

            void start(){
                System.out.println("Start from Parent");
            }
            void finish(){
                System.out.println("Finish from Parent");
            }
        }

        //Клас-нащадок з перевизначеним методом
        class Child extends Parent {
            Child(){super();}

            @Override
            void start() {
                System.out.println("Start from Child");
            }

            void stop() {
                System.out.println("Stop from Child");
            }
        }

        //Розширення типу
        Parent parent = new Child();
        parent.start();//"Start from Child"
        parent.finish();//"Finish from Parent"

        System.out.println();

        //Звуження типу
        Child child = new Child();
        if (child instanceof Child) child=(Child)parent;
        child.start();//"Start from Child"
        child.finish();//"Finish from Parent"
        child.stop();//"Stop from Child"
    }
}
