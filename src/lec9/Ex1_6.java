package lec9;

/**
 * Відношення агрегації між класами
 * Клас Bike агрегує клас Beep
 */

public class Ex1_6 {
    public static void main(String[] args) {

        //Підлеглий клас
        class Beep {
            int power;

            public Beep(int power) {
                this.power = power;
            }
        }

        //клас-агрегатор
        class Bike {
            String model;
            Beep beep;

            public Bike(String model,Beep beep) {
                this.model = model;
                this.beep = beep;//Утворення "слабкого"  звязку
            }
        }

        Beep beep = new Beep(100);
        Bike bike = new Bike("Java",beep);
        System.out.println("Bike " +
                bike.model +
                ": " +
                bike.beep.power);
    }
}
