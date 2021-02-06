package codewars;

import java.util.Arrays;

public class flattenAndSort {
    public static int[] flattenAndSort(int[][] array) {
        int[] flatArray = Arrays.stream(array).flatMapToInt(Arrays::stream).sorted().toArray();
        return flatArray;
    }
}
