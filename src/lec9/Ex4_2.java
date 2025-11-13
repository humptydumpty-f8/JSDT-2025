package lec9;

/**
 * Фіналізація полів та параметрів методу в класі
 */
public class Ex4_2 {
    public static void main(String[] args) {

        final int MY_CODE = 12345;//Глобальна константа

        class Foo {
            final private  int field;//Якщо поле використовується в конструкторі, воно має бути final

            public Foo(final int field) {//Використовується final-параметр методу
//                field++;
                this.field = field;
            }

            void showField() {
                System.out.println("field: " + field);
            }
        }

        (new Foo(MY_CODE)).showField();
    }
}
