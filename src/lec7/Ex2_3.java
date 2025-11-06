package lec7;
/**
 * Робота метода finalize()
 */

public class Ex2_3 {

    public static void main(String[] args) {

        MyClass my = new MyClass("Example #1");
        my=null;
        System.gc();//викликати збирання сміття
    }
}
