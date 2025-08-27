package lec3;


import java.util.Scanner;

/**
 * Введення даних з використанням Scanner і конструкції try-with-resources
 */
public class Ex4_2 {
    public static void main(String[] args) {

        System.out.print("Input personal data (name-age-height): ");//запрошення на введення

        try (Scanner in = new Scanner(System.in)) { //створення сканера

            String name = in.next();//зчитування тексту
            int age = in.nextInt();//зчитування цілого числа
            double height = in.nextDouble();//зчитування дійсного числа
            System.out.printf("%S\n\t ade:%d\t height:%.2f\n", name, age, height);//виведення зчитаних даних
        }

    }
}
