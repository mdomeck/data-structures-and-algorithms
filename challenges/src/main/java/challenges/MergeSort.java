package challenges;

import java.util.Arrays;

public class MergeSort {                    // set up Java Class

    public int[] mergeSort(int[] unsortedArr) {         // set up method declaration, returning an array of integers assumed to be unsorted
        int n = unsortedArr.length;                  // declaring integer n as the length of the unsorted array
        int[] sortedArr = new int[n];
        if (n > 1) {                                                   // if n is greater than 1 code steps into following code block
            int mid = n / 2;                                            // declare mid with value of n divided by 2
            int[] left = new int[mid];                               // new array left is assigned the size of mid (half the size of unsortedArr)
            System.arraycopy(unsortedArr, 0, left, 0, mid); // Java way to move first half of array to left

            int[] right = new int[n - mid];                                     // new array right is assigned the length of the array subtracted by the mid (the back half size of unsortedArr)
            System.out.println("this is the left array" + Arrays.toString(left));
            System.arraycopy(unsortedArr, mid, right, 0, n - mid);    // Java way to split second half of the array
            System.out.println("this is right array" + Arrays.toString(right));

            int[] newLeft = mergeSort(left);                             //recursive on the above code on left array
            int[] newRight = mergeSort(right);                              // recursive on the above code on right array
//            merge(newLeft, newRight, sortedArr);                      // merge the left and right and return sorted array
//            return sortedArr;         // return sortedArr
            return merge(newLeft, newRight, sortedArr);
        } else {
            return unsortedArr;                                         // base case return with just 1 value in array
        }

    }

    public int[] merge(int[] left, int[] right, int[] arr) {    // declaring the helper function that will return the sorted array
        int i = 0;                                              // declaring i as 0. It's a counter
        int j = 0;                                                // declaring j as 0. It's a counter
        int k = 0;                                                   // declaring k as 0. It's a counter

        while (i < left.length && j < right.length) {             // while i is less than the length of the left array and j is less than the lnegth of the right array
            if (left[i] <= right[j]) {                            // if the int at left array's value at index position of 1 is less than or equal to the right array
                arr[k] = left[i];                               // then the value of arr at position k is equal to the calue at the index position of left at 1
                i = i + 1;                                      // increment 1
            } else {                                            // Otherwise
                arr[k] = right[j];                              // the value of arr at position k is equal to the value of the right array at position j
                j++;                                         // increment
            }
            k++;                                        // increment
        }
        if (i == left.length) {                                   // if i is equal o the length of the left
            System.arraycopy(right, j, arr, k, right.length - j);  // move the remainder of the right array into arr (in position)
            System.out.println("this is is i is equal" + Arrays.toString(arr));
        } else {
            System.arraycopy(left, i, arr, k, left.length - i); // move the remainder of the left array into arr (in position)
            System.out.println("this is is j is equal" + Arrays.toString(arr));

        }
        return arr;
    }

}

