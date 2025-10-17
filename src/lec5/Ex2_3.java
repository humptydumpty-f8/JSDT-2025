package lec5;

import java.util.Arrays;

/**
 * Заповнення масивів початковими значеннями
 */
public class Ex2_3 {
    /**
     * Клас з методом для заповнення масиву даного типу вказаним елементом
     * @param <T> параметризований тип
     */
    static class FillArray<T> {
        T[] array;
        T fillValue;

        /**
         * Заповнення масиву даного типу вказаним елементом
         * @param array масив даного типу
         * @param fillValue елемент заповнення
         */
        public FillArray(T[] array, T fillValue) {
            this.array = array;
            this.fillValue = fillValue;
            Arrays.fill(array, fillValue);
        }

        public void print() {
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args) {

        Integer[] i_arr = {1, 2, 3};
        Double[] d_arr = {.0001, 2., 3.};
        Character[] c_arr = {'1', 126, '\u0077'};
        Boolean[] bul_arr = {false, true, false};
        String[] str = {"1", "2", "3"};

        new FillArray<Integer>(i_arr, 10).print();
        new FillArray<Double>(d_arr, 100.).print();
        new FillArray<Character>(c_arr, 'a').print();
        new FillArray<Boolean>(bul_arr, true).print();
        new FillArray<String>(str, "...").print();
    }
}
