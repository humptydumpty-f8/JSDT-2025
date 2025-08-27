package lec3;

/**
 * Приклад форматованого виведення таблиці
 */
public class Ex2_3 {
    public static void main(String[] args) {

        String format = "%3d %-20S %6.2f %n";

        System.out.printf("%3s %-20S %-8s %n", "#", "Student", "Height (cm)");
        System.out.printf("%3s %-20S %-8s %n", "---", "--------------------", "------");
        System.out.printf(format, 1, "Pupkin", 200.267);
        System.out.printf(format, 2, "bender", 183.7);
        System.out.printf(format, 3, "Gritsatsueva", 165.);
    }
}
