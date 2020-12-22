package challenges;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class BinarySearchTest {
    @Test
    public void testSomeLibraryMethod() {
        BinarySearch classUnderTest = new BinarySearch();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }
    @Test
    public void testBinarySearchArray() {
        BinarySearch binarySearch = new BinarySearch();
        int[] inputArray = {4,8,15,16,23,42};
        int num = 15;
        assertEquals(2, binarySearch.binarySearch(inputArray, num));
    }
    @Test
    public void testBinarySearchArrayNotInArray() {
        BinarySearch binarySearch = new BinarySearch();
        int[] inputArray = {11,22,33,44,55,66, 77};
        int num = 90;
        assertEquals(-1, binarySearch.binarySearch(inputArray, num));
    }

}
