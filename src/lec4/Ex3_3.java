package lec4;

/**
 * Містика кеширування
 *
 * Усі цілі числа у проміжку від -128 до 127 включно  кешуються.
 * Тому коли ми створюємо нову змінну і присвоюємо їй ціле значення, що лежить у проміжку від -128 до 127,
 * ми не створюємо новий об'єкт, а присвоюємо змінну посилання на вже створений об'єкт у кеші.
 */
public class Ex3_3 {
    public static void main(String[] args) {
        int a = 100;
        int b = 100;
        System.out.println(a==b);//true

        Integer A = 100;
        Integer B = 100;
        System.out.println(A==B);//true
        //Порівняння значень посилального типу
        System.out.println(A.equals(B));//true
    }
}
