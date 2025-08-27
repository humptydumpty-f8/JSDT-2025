package lec3;

/**
 * Простий приклад форматованого виведення цілих чисел
 */

public class Ex2_1 {
    public static void main(String[] args) {

        int x = 333;
        int y = 22;
        int z = -1;
        System.out.printf("x=%+6d \n y=%+6d \n z=%+06d", x, y, z);
    }
}
