package lec5;

/**
 * Вибір елементу за індексом
 */
public class Ex1_2 {

    final static int INDEX_OF_ELEMENT = 2;//глобальна константа

    /**
     * Виводить елемент масиву з заданим індексом
     * @param index  індекс
     * @param array  масив
     * @param <T> параметризований тип
     * @return array[index]
     */
    static <T> T getByIndex(int index, T[] array){
        return array[index];
    }

    public static void main(String[] args) {

        Byte[] b_arr = new Byte[] {1,2,3};
        short[] s_arr = {1,2,3};
        Integer[] i_arr = {1,2,3};
        long l_arr[] = {1,2,3};
        float f_arr[]= {1,2,3};
        double[] d_arr = {1,2,3};
        Character[] c_arr = {'1',126,'\u0077'};
        boolean[] bul_arr = {false,true,false};
        String[] str_arr = {"one","two","three"};

        System.out.println("i_arr["+INDEX_OF_ELEMENT+"]: "+getByIndex(INDEX_OF_ELEMENT,i_arr));
        System.out.println("c_arr["+INDEX_OF_ELEMENT+"]: "+getByIndex(INDEX_OF_ELEMENT,c_arr));
        System.out.println("str_arr["+INDEX_OF_ELEMENT+"]: "+getByIndex(INDEX_OF_ELEMENT,str_arr));
        System.out.println("b_arr["+INDEX_OF_ELEMENT+"]: "+getByIndex(INDEX_OF_ELEMENT, new Byte[] {1,2,3}));
    }
}
