package lec4;

import java.util.Arrays;

/**
 * Основні методи класу String
 */
public class Ex7_2 {
    public static void main(String[] args) {

        String str1 = new String("Line 1");
        String str2 = "Line 2";

        System.out.println(str1.concat(str2));
        System.out.println(str2.length());//6
        System.out.println(str1.charAt(2));//i
        System.out.println(str1.substring(4,6));//1
        System.out.println(Arrays.toString(str2.split(" ")));
        System.out.println (str1.contains("1"));//true
        System.out.println(str2.indexOf('2'));//5
    }
}
