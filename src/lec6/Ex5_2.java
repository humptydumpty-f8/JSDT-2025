package lec6;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Стек на основі Deque
 */
public class Ex5_2 {
    public static void main(String[] args) throws InterruptedException {

        int time = 10;
        Deque<Integer> deque = new LinkedList<Integer>();

        for (int i = time; i>= 0; i--)
            deque.push(i);

        while (!deque.isEmpty ()) {
            System.out.println(deque.pop());
            Thread.sleep(1000);
        }

    }
}