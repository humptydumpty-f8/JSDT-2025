package lec5;

/**
 * Приклади методів, які отримують змінну кількість аргументів
 */
public class Ex6_2 {

    /**
     * Солідація значень
     *
     * @param param аргумент змінної довжини
     * @return суму значень типу double
     */

    static <N extends Number> double sum(N ... param) {
        double sum = 0.;
        for (N n:param) {
            sum += n.doubleValue();
        }
        return sum;
    }


    /**
     * Визначення середнього значення
     *
     * @param param аргумент змінної довжини
     * @return середнє значення
     */

    static <N extends Number> double average(N ... param) {
        double avg=0;
        int n = param.length;

        for (N value : param) avg += value.doubleValue();
        return avg/n;
    }
    public static void main(String[] args) {

        System.out.println("Сума : " + sum(1,-2,3));
        System.out.printf("Середнє : %.4f %n", average(1.,-2.0,3));
        System.out.println("Середнє : " + average(new Double[]{1.,-2.0,3.,4.}));



    }
}
//todo add method to find the minimum value