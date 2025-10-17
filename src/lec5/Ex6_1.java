package lec5;

/**
 * Обробка аргументів змінної довжини
 */
public class Ex6_1 {
    /**
     * Виводить список введених аргументів
     * @param array аргумент змінної довжини
     */
    static <E> void test(E... array) {
        System.out.println("Число аргументів: " + array.length);
        for (E e : array) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        test();
        test(1);
        test(1, 2);
        test(new Integer[]{1,2,3});

        test(1.1,2.2,3.3,4.4);
    }
}
