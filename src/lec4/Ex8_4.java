package lec4;

/* Приклад з практикуму

 * Визначити значення і індекси локальних мінімумів вихідного одновимірного масиву a
 * (елемент масиву називається локальним мінімумом, якщо він строго менше своїх сусідів).
 */
public class Ex8_4 {

    static class GenExml<T extends Comparable> {
    private T[] array;

    public GenExml(T[] array){
        this.array = array;
    }

    void locMinPrint(){
        for (int i=1;i< array.length-1;i++){
            if (array[i].compareTo(array[i-1])<0 && array[i].compareTo(array[i+1])<0){
                System.out.printf("%s (%d)%n",array[i].toString(),i);
            }
        }
    }
}
    public static void main(String[] args) {

        GenExml<String> genExml = new GenExml<>(new String[]{"abc","ab", "bcd","dbc","bab", "bcd"});
        genExml.locMinPrint();

        System.out.println();

        GenExml<Character> genExml1 = new GenExml<>(new Character[]{'c','a','d','f','e','r'});
        genExml1.locMinPrint();

    }

}
