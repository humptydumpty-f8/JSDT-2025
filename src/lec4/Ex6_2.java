package lec4;

import java.math.BigInteger;

/**
 * Обрахування вирахування v = (a**n) (mod m)
 */
public class Ex6_2 {
    public static void main(String[] args) {
        BigInteger a,m;
        a=BigInteger.valueOf(678);
        m=BigInteger.valueOf(59_555_959);
        int n = 12345;

        BigInteger v = (a.pow(n)).mod(m);
        System.out.println(v);
    }
}
