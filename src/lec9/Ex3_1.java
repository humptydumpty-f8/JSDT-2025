package lec9;

/**
 * Статичний поліморфізм (перевантаження методів)
 */
public class Ex3_1 {

    public static void main(String[] args) {

        /**
         * Базовий клас з трьома перевантаженими методами
         */
        class OverloadBase {
            /**
             * Тестовий метод без параметрів
             */
            void test () {
                System.out.println("Параметри відсутні");
            }
            /**
             * Тестовий метод з параметром
             * @param a ціле число
             */
            void test(int a) {
                System.out.println("а: " + a);
            }
            /**
             * Тестовий метод з двома параметрами
             * @param a ціле число
             * @param b ціле число
             */
            void test(int a, int b) {
                System.out .println ("а и b: " + a + " " + b) ;
            }
        }
        /**
         * Успадкований клас з перевантаженим методом
         */
        class OverloadChild extends OverloadBase {
            /**
             * Тестовий метод з параметром
             * @param v дійсне число
             * @return квадрат числа
             */
            double test(double v) {
                System.out.println("double v: " + v);
                return v*v;
            }
        }

        OverloadChild child = new OverloadChild() ;
        double result;

        // Виклик всіх версій перевантажених методів
        System.out.println("\tПеревантажені методи:");
        child.test () ;
        child.test (10);
        child.test (10, 20);

        result = child.test(123.25) ;
        System.out.println("Результат child.test(123.25) : " + result);

        // Застосування автоматичного перетворення типів при перевантажені
        System.out.println("\tАвтоматичне перетворення типів:");
        byte i=10;
        child.test(i); //виклик test(int)
        child.test(i,i); //виклик test(int,int)
        child.test(i+0.);//виклик test(double)

    }
}
