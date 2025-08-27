package lec3;


import java.util.Scanner;

/**
 * Введення даних з використанням Scanner
 */
public class Ex4_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);//створення сканера
        System.out.print("Input personal data (name-age-height): ");//запрошення на введення
        String name = in.next();//зчитування тексту
        int age = in.nextInt();//зчитування цілого числа
        double height = in.nextDouble();//зчитування дійсного числа
        System.out.printf("%S\n\t age:%d\t height:%.2f\n", name, age, height);//виведення зчитаних даних
        in.close();//закриття сканера
    }
}
