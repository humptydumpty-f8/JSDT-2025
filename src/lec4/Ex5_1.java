package lec4;

/**
 * Автоматичне просування типів
 */
public class Ex5_1 {
    public static void main(String[] args) {

        double d = 100.0;
        long l=100l;
        int i = 900;
        char ch='j';//106
        System.out.println(d*ch+i/ch);
        System.out.println(l*ch+i/ch);
    }
}
