package lec10;

/**
 * Створення "екземплярів" абстрактного класу Animal
 */
public class Ex1_1 {
    public static void main(String[] args) {

        //Анонімний внутрішній клас як реалізація абстрактного класу
        Animal animal1 = new Animal("cat") {
            @Override
            String say() {
                return "m-rrr";
            }
        };
        System.out.printf("%d. %S < %S\n",animal1.getCounter(),animal1.kind,animal1.say());

        //Анонімний внутрішній клас як реалізація абстрактного класу
        Animal animal2 = new Animal("dog") {
            @Override
            String say() {
                return "gav-vvv";
            }
        };
        System.out.printf("%d. %S < %S\n",animal2.getCounter(),animal2.kind,animal2.say());
    }
}
