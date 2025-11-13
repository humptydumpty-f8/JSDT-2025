package lec9;

/**
 * Відношення композиції між класами
 * Клас ElectricCar утворює композицію з класом ElectricEngine
 */

public class Ex1_5 {
    public static void main(String[] args) {

        //Залежний клас
        class ElectricEngine{
            int power;
            public ElectricEngine(int power) {
                this.power = power;
            }
        }

        //Клас-композиція
        class ElectricCar {
            String model;
            ElectricEngine engine;

            public ElectricCar(String model, int power){
                this.model = model;
                this.engine = new ElectricEngine(power);//Утворення "сильного"  звязку
            }
        }

        ElectricCar electricCar = new ElectricCar("Tesla",310);

        System.out.println("ElectricCar " + electricCar.model +": " +
                electricCar.engine.power);
    }
}
