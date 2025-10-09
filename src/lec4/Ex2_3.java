package lec4;

/**
 * Цілочисельні операції з числами в різних представленнях
 */
public class Ex2_3 {
    public static void main(String[] args) {

        int num111 = 0x6F; // 16-кова система, число 111
        int num8 = 010; // 8-кова система, число 8
        int num11 = 0b11; // 2-кова система, число 3
        int summa = num111 + num8 + num11;

        System.out.println("Unformatted output");
        System.out.println("num111 + num8 + num11 =" + (num111 + num8 + num11)); //122
        System.out.println("0x6F+010+0b11 =" + (0x6F + 010 + 0b11)); //122

        System.out.println("\nFormatted output");
        System.out.printf("%h +%o +%b =%d",num111,num8,num11,summa);//%b - для boolean!
    }
}
