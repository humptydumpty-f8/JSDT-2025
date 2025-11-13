package lec10;

/**
 * Вкладені внутрішні класи
 */

//Зовнішній клас велосипеду
class Bicycle {

    //Поля
    private String model;//модель
    private int weight;//вага

    //Конструктор
    public Bicycle(String model, int weight) {
        this.model = model;
        this.weight = weight;
    }

    //Метод початку руху
    public void start() {
        System.out.println("Поїхали!");
    }

    //Внутрішній клас кермування
    public class SteeringWheel {

        public void right() {
            System.out.println("Руль вправо!");
        }

        public void left() {
            System.out.println("Руль вліво!");
        }
    }

    //Внутрішній клас розташування
    public class Seat {

        public void up() {
            System.out.println("Сідло подняте вище!");
        }

        public void down() {
            System.out.println("Сідло опущене нижче!");
        }
    }
}


public class Ex4_2 {
    public static void main(String[] args) {

        Bicycle peugeot = new Bicycle("Peugeot", 120);//створили велосипед
        Bicycle.SteeringWheel wheel = peugeot.new SteeringWheel();//створили кермо у велосипеда
        Bicycle.Seat seat = peugeot.new Seat();//створили сідло у велосипеда

        seat.up();//підняли сідло
        peugeot.start();//почали рухатись
        wheel.left();//повернули ліворуч
    }
}
