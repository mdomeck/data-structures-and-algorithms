package challenges;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTest {

    @Test
    public void mergeSortTest(){
        int[] lostNumbers = {8, 4, 23, 42, 16, 15};
        MergeSort mergeSort = new MergeSort();
        int[] sortedNumbers = mergeSort.mergeSort(lostNumbers);
        int[] sortedLostNumbers = {4, 8, 15, 16, 23, 42};
        //System.out.println(Arrays.toString(sortedNumbers));
        assertArrayEquals(sortedLostNumbers, sortedNumbers);
    }


    @Test
    public void mergeSort2Test(){
        int[] lostNumbers = {8};
        MergeSort mergeSort = new MergeSort();
        int[] sortedNumbers = mergeSort.mergeSort(lostNumbers);
        int[] sortedLostNumbers = {8};
        //System.out.println(Arrays.toString(sortedNumbers));
        assertArrayEquals(sortedLostNumbers, sortedNumbers);
    }

    @Test
    public void mergeSort3Test(){
        int[] lostNumbers = {8, 10, 20, -15};
        MergeSort mergeSort = new MergeSort();
        int[] sortedNumbers = mergeSort.mergeSort(lostNumbers);
        int[] sortedLostNumbers = {-15, 8, 10, 20};
        //System.out.println(Arrays.toString(sortedNumbers));
        assertArrayEquals(sortedLostNumbers, sortedNumbers);
    }

}
