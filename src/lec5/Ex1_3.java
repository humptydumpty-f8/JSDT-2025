package lec5;

/**
 * Властивість length
 */
public class Ex1_3 {
    /**
     * Виводить довжину і елементи масиву
     *
     * @param array масив
     * @param <T>   параметризований тип
     */
    static <T> void getLengthAndElements(T array[]) {

        System.out.print("Elements: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nLength: " + array.length);
        System.out.println();
    }

    public static void main(String[] args) {

        byte b_arr[] = new byte[]{1, 2, 3};
        short[] s_arr = {1, 2, 3};
        Integer[] i_arr = {0, 1, 2, 3, 4, 5};
        long l_arr[] = {1, 2, 3};
        float f_arr[] = {1, 2, 3};
        double[] d_arr = {1, 2, 3};
        Character[] c_arr = {'1', 126, '\u0077'};
        Boolean[] bul_arr = {false, true, false, false, true, false, false, true, false};
        String[] str = {"one", "two", "3"};

        getLengthAndElements(i_arr);
        System.out.println();

        getLengthAndElements(bul_arr);
        System.out.println();

        getLengthAndElements(c_arr);
        System.out.println();

        getLengthAndElements(str);
        System.out.println();
    }
}
