package challenges;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class QuickSortTest {

    @Test
    public void quickSortTest(){
        //int[] lostNumbers = {8, 4, 23, 42, 16, 15};
        int[] lostNumbers = {42, 8, 4, 23, 16, 15};
        QuickSort quickSort = new QuickSort();
        int[] quickNumbers = quickSort.quickSort(lostNumbers, 0, 5);
        System.out.println(Arrays.toString(quickNumbers));
        //assertArrayEquals(sortedLostNumbers, sortedNumbers);
    }

}
