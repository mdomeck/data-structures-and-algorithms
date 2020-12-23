package codewars;

import java.util.Collections;
import java.util.Vector;

public class SortOdd {
    public static int[] sortArray(int[] array) {

        Vector<Integer> oddArr = new Vector<Integer>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddArr.add(array[i]);
            }
        }
        Collections.sort(oddArr);

        int counter = 0;

        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 1) {
                array[j] = oddArr.get(counter);
                counter++;
            }
        }
        return array;
    }
}
