package lec4;

/**
 * Перетворення цілочисельних типів у виразах, "циклічність" int та long
 */
public class Ex2_2 {
    public static void main(String[] args) {

        byte b1 = 1, b2=2;
//        byte b = b1+b2;//Помилка компіляції!
        byte b = (byte)(b1+b2);

        short s1 = 3, s2=4;
//        short s = s1+s2;//Помилка компіляції!
        short s=(short)(s1+s2);

//        The int type in Java can be used to represent any whole number from -2147483648 to 2147483647
        int i1=1,i2=2_147_483_647;
        int i= i1+i2;//-2147483648 - результат "зациклення"

//        The long  has a minimum value of -9_223_372_036_854_775_808 and a maximum value of 9_223_372_036_854_775_807
        long l1 = 1,l2= 9_223_372_036_854_775_807L;//max long
        long l=l1+l2;//-9223372036854775808 - результат "зациклення"

        System.out.println("Calculation results:");
        System.out.printf("b=%d\n" +
                "s=%d\n" +
                "i=%d\n" +
                "l=%d",b,s,i,l);
    }
}
