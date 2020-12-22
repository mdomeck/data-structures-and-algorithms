package challenges;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InsertionSortTest {

    @Test
    public void testEmptyInsertionSort() throws Exception{
        int[] testEmpty = new int[] {};

        Exception exception = assertThrows(Exception.class, () -> {
            InsertionSort.insertionSort(testEmpty);
        });

        String expectedMessage = "This array is empty";
        String actual = exception.getMessage();

        assertTrue(actual.contains(expectedMessage));
    }

    @Test
    public void testEdgeCaseInsertionSort() throws Exception {
        int[] negativeNum = new int[]{9, 23, -14, -10, 2, 18};
        int[] expectedArr = new int[]{-14, -10, 2, 9, 18, 23};
        assertArrayEquals(expectedArr, InsertionSort.insertionSort(negativeNum), "expected sorted array");
    }

    @Test
    public void testHappyPathInsertionSort() throws Exception {
        int[] classUnderTestArray = new int[]{8, 4, 23, 42, 16, 15};
        int[] expectedArr = new int[]{4, 8, 15, 16, 23, 42};
        assertArrayEquals(expectedArr, InsertionSort.insertionSort(classUnderTestArray), "expected sorted array");
    }

}
