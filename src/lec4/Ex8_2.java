package lec4;

/**
 * Використання узагальненого класа CalculatorT<E>
 */
public class Ex8_2 {
    public static void main(String[] args) {

        Integer[] intArr = {1,2,3};
        CalculatorT<Integer> intObj = new CalculatorT<>(intArr);
        System.out.printf("Sum of values: %d",(int)intObj.sum());

        System.out.println();

        CalculatorT<Double> dblObj = new CalculatorT<>(new Double[]{-1.2, 4., 0.09});        ;
        System.out.printf("Sum of values: %.2f" ,dblObj.sum());

        //todo: Try other E
    }
}
