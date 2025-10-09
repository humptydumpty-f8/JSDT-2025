package lec4;

/**
 * Способи упаковування і розпаковування
 */
public class Ex3_1 {
    public static void main(String[] args) {

        int i;
        Integer boxed;

        //Способи упаковування
        i = 1;
//        boxed = new Integer(i); // Конструктор
        boxed = Integer.valueOf(i);// Фабричний метод
        boxed = i;// Автоматична упаковка,
        System.out.println("Boxed value of " + i + ": " + boxed);

        //Способи розпаковування
        boxed = 2;
//        i = boxed.intValue();// Явне разпакування
        i = boxed;// Автоматичне разпакування
        System.out.println("Unboxed value of " + boxed + ": " + i);
    }
}
