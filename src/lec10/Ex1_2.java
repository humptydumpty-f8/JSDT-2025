package lec10;
/**
 * Наслідування абстрактпого класу
 */
public class Ex1_2 {
    public static void main(String[] args) {

        //Клас-спадкоємець
        class Cat extends Animal{

            protected String nickname;//Кличка тварини

            //Конструктори
            public Cat() {
                super("cat");
            }
            public Cat(String nickname) {
                this();
                this.nickname=nickname;
            }

            //Визначення абстрактного методу батьківського класу
            @Override
            String say() {
                return "m-rrr";
            }
        }


        //Сценарій використання
        Cat felix = new Cat("Felix");
        System.out.printf("%d. %S %S < %S\n",felix.getCounter(),felix.kind,felix.nickname,felix.say());

        Cat marfa = new Cat("Marfa");
        System.out.printf("%d. %S %S < %S\n",marfa.getCounter(),marfa.kind,marfa.nickname,marfa.say());
    }
}
