package lec5;

import java.util.Arrays;
import java.util.Collections;

/**
 * Сортування масивів
 */
public class Ex2_4 {

    static Integer[] i_arr = {-1, 2, -3};
    static Double[] d_arr = {.0001, -201.045, 1_000_000.1};
    static Character[] c_arr = {'b', 'c', 'a'};
    static Boolean[] bul_arr = {false, true, false};
    static String[] str = {"st2", "st3", "st1"};

    /**
     * Демонстрація сортування масивів (з попереднім копіюванням)
     *
     * @param arr масив
     * @param <T> параметризований тип
     */
    static <T extends Comparable> void demoSorter(T[] arr) {
        System.out.println("Unordered: " + Arrays.toString(arr));
        T[] arr_copy = Arrays.copyOf(arr, arr.length);
        System.out.println("Copy: " + Arrays.toString(arr_copy));
        Arrays.sort(arr_copy);
        System.out.println("Ordered: " + Arrays.toString(arr_copy));
        Arrays.sort(arr_copy,Collections.reverseOrder());
        System.out.println("Reversed: " + Arrays.toString(arr_copy));
        System.out.println();
    }

    public static void main(String[] args) {

        demoSorter(i_arr);
        demoSorter(d_arr);
        demoSorter(c_arr);
        demoSorter(bul_arr);
        demoSorter(str);
    }
}
