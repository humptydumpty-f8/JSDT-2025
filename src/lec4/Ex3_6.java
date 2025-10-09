package lec4;

/**
 *Використання Integer.toBinaryString()
 */
public class Ex3_6 {
    public static void main(String[] args) {

        int x=0b111, y=22;
        System.out.printf("Binary summa: %s + %s = %s",
                Integer.toBinaryString(x),//111
                Integer.toBinaryString(y),//10100
                Integer.toBinaryString(x+y));//11101
    }
}
