package lec5;

import java.util.Arrays;

/**
 * Відображення масивів різних типів
 */
public class Ex2_2 {
    /**
     * Відображає масив вказаного типу
     *
     * @param arr масив
     * @param <T> параметризований тип
     */
    static <T> void printArray(T[] arr) {
        System.out.println(arr.getClass().getName() + " " + Arrays.toString(arr));
    }

    public static void main(String[] args) {

        Integer[] i_arr = {0b11, 02, 0xf};
        Double[] d_arr = {.00001, 2.56, 12_345.676_890};
        Character[] c_arr = {'1', 126, '\u0077'};
        Boolean[] bul_arr = {false, true, false};
        String[] str = {"1", "2", "3"};

        printArray(i_arr);
        printArray(d_arr);
        printArray(c_arr);
        printArray(bul_arr);
        printArray(str);
    }
}
