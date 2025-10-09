package lec4;

/**
 * Неявне і явне приведення типів
 */
public class Ex4_1 {
    public static void main(String[] args) {

        //Неявне приведення числових типів
        double numDbl;
        numDbl = 0x1111;
        System.out.println("Double number:" + numDbl);

        //Явне приведення числових типів
        int numInteger = (int) 2222.3333;
        System.out.println("Integer number:" + numInteger);

        //Неявне приведення char до цілих числових типів
        long numInt = '\u2654' ;
        System.out.println("Integer number:" + numInt);

        //Явне приведення цілих числових типів до char
        System.out.println("Char:" + (char)104);

        //Числові типи даних не сумісні з boolean, а char і boolean не сумісні між собою
//        System.out.println("Integer number:" + (int)numBoolean);//Помилка компіляції!
//        System.out.println("Boolean number:" + (boolean)numChar);//Помилка компіляції!
    }
}
