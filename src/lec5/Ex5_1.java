package lec5;

/**
 * Використання анонімного масиву
 */
public class Ex5_1 {

    static <N extends Number> double sum(N[] array) {
        double sum = 0.;
        for (N n:array) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        //Виклик функції з аргументом у вигляді анонімного масиву
        System.out.println(sum(new Double[]{1.,2.1,3.3,4.1,5.}));
    }
}
