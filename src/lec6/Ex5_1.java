package lec6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/**
 * Таймер зворотнього відліку на основі Queue
 */
public class Ex5_1 {
    public static void main(String[] args) throws InterruptedException {

        int time = 5;//початковий час в сек.
        Queue <Integer> queue = new LinkedList<Integer>();

        for (int i = time; i>= 0; i--)
            queue.offer (i);

        while (!queue.isEmpty ()) {
            System.out.println(queue.poll());
            TimeUnit.SECONDS.sleep(1);
        }

    }
}