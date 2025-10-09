package lec4;

import java.math.BigInteger;

public class Ex6_1 {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("987654321");//використовується конструктор
        BigInteger b = BigInteger.valueOf(123456789);//використовується фабричний метод
        BigInteger ab = a.multiply(b);//результат множення

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a*b = " + ab);
        System.out.println();
// За допомогю gcd() знаходяться найбільші спільні дільники
        System.out.println("gcd(a*b,a)= " + ab.gcd(a));
        System.out.println("gcd(a*b,b)= " + ab.gcd(b));
    }

}
