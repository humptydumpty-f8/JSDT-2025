package lec10;

/**
 * Статичний вкладений клас Drawing
 */

//Зовнішній клас
class Car {

    //Поля
    private int manufactureYear;
    private String model;

    //Конструктор
    public Car() {
        this.manufactureYear = manufactureYear;
        this.model = model;
    }

    //Статичний вкладений клас з кресленнями
    public static class Drawing {
        public void show() {
            System.out.println("Show drawing");
        }
    }
}

public class Ex3_1 {

    public static void main(String[] args) {

        Car.Drawing drawing = new Car.Drawing();
        drawing.show();//виклик методу статичного класу
    }
}
