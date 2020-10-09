package challenges;

import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class ArrayShiftTest {

    @Test
    public void testEdgeCaseArrayShift(){
        ArrayShift emptyArray = new ArrayShift();
        int[] testEmpty = {};
        int[] arrayAdded = {3};
        Assert.assertArrayEquals(arrayAdded, emptyArray.arrayShift(testEmpty, 3));
    }


    @Test
    public void testArrayShift() {
        ArrayShift testPotato = new ArrayShift();
        int[] testArr = {11, 12, 13, 14};
        int num1 = 7;

        int[] secondArr = {10, 11, 12, 13, 14};
        int num2 = 0;

        int[] newArr = testPotato.arrayShift(testArr, num1);
        assertEquals(newArr[2], num1);

        int[] anotherArr = testPotato.arrayShift(secondArr, num2);
        assertEquals(anotherArr[3], num2);
    }
    // edge case for an empty array

}
