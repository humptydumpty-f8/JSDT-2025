package lec5;

/**
 * Обхід одновимірного масиву  за допомогою foreach
 */

public class Ex4_1 {

    static Integer[] i_arr = {-1, 2, -3};
    static Double[] d_arr = {.0001, -20., 1_000.};
    static Character[] c_arr = {'Ф', 'ї', 'ж'};
    static Boolean[] bool_arr = {true, false, false};
    static String[] str = {"st2", "st3", "st1"};

    static <T> void arrayPrint(T[] arr){
        System.out.print("[");
        for (T i : arr) {
            System.out.print(i + ", ");
        }
        System.out.print("\b\b]\n");
    }

    public static void main(String[] args) {

        arrayPrint(i_arr);
        arrayPrint(d_arr);
        arrayPrint(c_arr);
        arrayPrint(bool_arr);
        arrayPrint(str);

    }
}
