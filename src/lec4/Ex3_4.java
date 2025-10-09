package lec4;

/**
 * Деякі методи обгортки Integer
 */
public class Ex3_4 {
    public static void main(String[] args) {
//декодування в 10-кове представлення
        System.out.println(Integer.decode("111"));//111
        System.out.println(Integer.decode("0x111"));//273
        System.out.println(Integer.decode("0111"));//73
//        System.out.println(Integer.decode("0b111"));

// отримання числа з тексту
        System.out.println(Integer.parseInt("0111",2));//7
        System.out.println(Integer.parseInt("-111"));//-111
        System.out.println(Integer.valueOf("112"));

//переведенння в іншу систему числення
        System.out.println(Integer.toBinaryString(7));//111
        System.out.println(Integer.toHexString(111));//6f       ;
    }
}
