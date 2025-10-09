package lec4;

/**
 * Відмінність у порівнянні значень int та Integer
 */
public class Ex3_2 {
    public static void main(String[] args) {
        int a = 1000;
        int b = 1000;
        System.out.println(a==b);//true

        Integer A = 1000;
        Integer B = 1000;
        System.out.println(A==B);//false
        //Порівняння значень посилального типу
        System.out.println(A.equals(B));//true
    }
}
