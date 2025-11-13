package lec8;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Collections.*;


/**
 * Статичний імпорт методів з бібліотеки Collections
 */
public class Ex1_8 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        System.out.println("Max value: " + max(numbers));// Max value: 7
        System.out.println("Min value: " + min(numbers));// Min value: 1

        sort(numbers);// 1
        System.out.println("Sort: " + numbers);// Sort: [1, 2, 3, 4, 5, 6, 7]

        reverse(numbers);
        System.out.println("Reverse: " + numbers);// Reverse: [7, 6, 5, 4, 3, 2, 1]
    }
}
