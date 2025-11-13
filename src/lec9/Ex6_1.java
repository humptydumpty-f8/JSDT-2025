package lec9;
/**
 * Приклад використання патерну делегування
 */
public class Ex6_1 {
    /**
     * Визначення інтерфейсу
     */
    interface Car {
        public void ride(String name);
    }

    private static final String RIDER = "Tom";

    public static void main(String[] args) {

        /**
         * Реалізує делегування
         */
        class CarController implements Car {

            private final Car car;

            public CarController(Car car) { this.car = car; }

            @Override
            public void ride(String name) {
                car.ride(name);
            };
        }

/*
 * Допоміжні класи, які безпосередньо виконують дію – BMWCar, MercedesCar, VolvoCar –
 * вони також реалізують інтерфейс Car, але в самому додатку викликаються опосередковано
 * через екземпляр класу CarController, який делегує їм виконання роботи
*/

        /**
         * Допоміжний клас для моделі автомобіля BMW
         */
        class BMWCar implements Car {
            @Override
            public void ride(String name) {
                System.out.println(name + " rides in BMW");
            };
        }
        /**
         * Допоміжний клас для моделі автомобіля Mercedes
         */
        class MercedesCar implements Car {
            @Override
            public void ride(String name) {
                System.out.println(name + " rides in Mercedes");
            };
        }
        /**
         * Допоміжний клас для моделі автомобіля Volvo
         */
        class VolvoCar implements Car {
            @Override
            public void ride(String name) {
                System.out.println(name + " rides in Volvo");
            };
        }

        CarController bmw = new CarController(new BMWCar());
        CarController mercedes = new CarController(new MercedesCar());
        CarController volvo = new CarController(new VolvoCar());

        bmw.ride(RIDER);
        mercedes.ride(RIDER);
        volvo.ride(RIDER);
    }
}
