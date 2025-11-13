package lec10;

/**
 * Статичний вкладений клас (з статичним і нестатичним методами)
 */

//Зовнішній клас
class Comparator {
    //Статичний вкладений клас
    static class Operation {
        //статичний метод
        static int min(int x, int y) {
            return x >= y ? y : x;
        }
        //нестатичний метод
        int max(int x, int y) {
            return x >= y ? x : y;
        }
    }
}

public class Ex3_2 {
    public static void main(String[] args) {

        System.out.println("min = " + Comparator.Operation.min(2, 3));//виклик статичного методу

        Comparator.Operation oper = new Comparator.Operation();//створення екземпляру
        System.out.println("max = " + oper.max(2, 3));//виклик нестатичного методу
    }
}
