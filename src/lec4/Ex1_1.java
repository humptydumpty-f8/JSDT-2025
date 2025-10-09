package lec4;

/**
 * Порівняння змінних посилального типу
 */
public class Ex1_1 {
    //Вкладений статичний клас
    static class Foo {}

    public static void main(String[] args) {
        Foo foo = new Foo();
        Foo foo1 = foo;
        Foo foo2 = new Foo();

        System.out.println(foo==foo1);//true
        System.out.println(foo==foo2);//false
        System.out.println(foo1==foo2);//false

        System.out.println(foo);
        System.out.println(foo1);
        System.out.println(foo2);
    }
}
