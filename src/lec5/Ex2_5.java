package lec5;

import java.util.Arrays;

/**
 * Бінарний пошук в масивах
 */
public class Ex2_5 {

    static Integer[] i_arr = {-1, 2, -3};
    static Double[] d_arr = {.0001, -20., 1_000.};
    static Character[] c_arr = {'Ф', 'ї', 'ж'};
    static Boolean[] bul_arr = {false, false, false};
    static String[] str = {"st2", "st3", "st1"};

    /**
     * Клас для пошуку елемента в маствів
     * @param <T> параметризований тип
     */
    static class BinSearcher<T extends Comparable> {

        T[] arr;
        T needle;

        /**
         * Конструктор
         * @param arr масив
         * @param needle елемент для пошуку
         */
         BinSearcher(T[] arr, T needle) {
            this.arr = arr;
            this.needle = needle;
        }

        /**
         * Метод пошуку елемента в масиві
         * @param arr масив
         * @param needle елемента
         * @return індекс знайденого елементу
         */
        int find(T[] arr, T needle) {
            Arrays.sort(arr);
            return Arrays.binarySearch(arr, needle);
        }

        /**
         * Виведення результату пошуку
         */
        void printResult() {
            System.out.println(needle + " in " + Arrays.toString(arr) + ":\n" +
                    "\t" + find(arr,needle));
        }
    }

    public static void main(String[] args) {

        (new BinSearcher<Integer>(i_arr, 2)).printResult();
        (new BinSearcher<Double>(d_arr, 1000.)).printResult();
        (new BinSearcher<Character>(c_arr, 'ж')).printResult();
        (new BinSearcher<Boolean>(bul_arr, true)).printResult();
        (new BinSearcher<String>(str, "st1")).printResult();

    }
}
