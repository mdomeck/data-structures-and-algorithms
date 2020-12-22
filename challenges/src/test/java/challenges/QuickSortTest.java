package challenges;



import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class QuickSortTest {

    @Test
    public void quickSortTest(){
        int[] lostNumbers = {42, 8, 4, 23, 16, 15};
        QuickSort quickSort = new QuickSort();
        int[] quickNumbers = quickSort.quickSort(lostNumbers, 0, 5);
        System.out.println(Arrays.toString(quickNumbers));
        assertArrayEquals(lostNumbers, quickNumbers);
    }

    @Test
    public void testEmpty(){
        QuickSort quickSort = new QuickSort();
        int[] arr = {};
        int[] expected = {};

        quickSort.quickSort(arr, 0, 0);
        assertArrayEquals(expected, arr, "empty array");
    }

    @Test
    public void testOneValue(){
        QuickSort quickSort = new QuickSort();
        int[] arr = {8};
        int[] expected = {8};

        quickSort.quickSort(arr, 0, 0);
        assertArrayEquals(expected, arr, "array with one position");
    }

    @Test
    public void testNegativeValue(){
        QuickSort quickSort = new QuickSort();
        int[] arr = {8, 10, -5, -3};
        int[] expected = {-5, -3, 8, 10};

        quickSort.quickSort(arr, 0, 3);
        assertArrayEquals(expected, arr, "array with one position");
    }
}
