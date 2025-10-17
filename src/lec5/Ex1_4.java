package lec5;

/**
 * Спроба перегляду масиву методом toString()
 */
public class Ex1_4 {
    /**
     * Виводить посилання на масив
     *
     * @param array масив
     * @param <T> параметризований тип
     * @return посилання (вказівник) на масив
     */
    static <T> String getRef(T array) {
        return "Reference: " + array.toString() + "/n";
    }

    public static void main(String[] args) {

        byte b_arr[] = new byte[]{1, 2, 3};
        short[] s_arr = {1, 2, 3};
        Integer[] i_arr = {1, 2, 3};
        long l_arr[] = {1, 2, 3};
        float f_arr[] = {1, 2, 3};
        double[] d_arr = {1, 2, 3};
        Character[] c_arr = {'1', 126, '\u0077'};
        boolean[] bul_arr = {false, true, false};
        String[] str = {"1", "2", "3"};

        System.out.println(getRef(i_arr));
        System.out.println(getRef(c_arr));
        System.out.println(getRef(str));

    }
}
