package lec5;

/**
 * Застосування анонімних масивів замість списку аргументів змінної довжини
 */
public class Ex6_3 {

  /**
     * Визначення найменшого значенням
     *
     * @param param аргумент змінної довжини
     * @return найменше з значень
     */
    static <N extends Number> double min(N ... param)
    {
        double min;
        if (param.length == 0) return 0;
        min = param[0].doubleValue();
        for (N n : param) {
            if (min > n.doubleValue()) min = n.doubleValue();
        }
        return min;
    }

    /**
     * Визначення максимального значення
     *
     * @param param аргумент змінної довжини
     * @return найбільше з значень
     */
    static <N extends Number> double max(N ... param)
    {
        double max;
        if (param.length == 0) return 0;
        max = param[0].doubleValue();
        for (N n : param) {
            if (max < n.doubleValue()) max = n.doubleValue();
        }
        return max;
    }


    public static void main(String[] args) {

        System.out.println("Мінімальне серед аргументів : " + min(1.,-2.0,3));
        System.out.println("Maксимальне серед аргументів: " + max(1.,-2.0,3));

        System.out.println("Мінімальне в анонімному масиві : " + min(new  Double[]{1.,-2.0,3.}));

    }
}
