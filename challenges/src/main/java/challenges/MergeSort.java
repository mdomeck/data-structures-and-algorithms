package challenges;

import java.util.Arrays;

public class MergeSort {

    public int[] mergeSort(int[] unsortedArr) {
        int n = unsortedArr.length;
        int[] sortedArr = new int[n];
        if (n > 1) {
            int mid = n / 2;
            int[] left = new int[mid];
            System.arraycopy(unsortedArr, 0, left, 0, mid);

            int[] right = new int[n - mid];
            System.arraycopy(unsortedArr, mid, right, 0, n - mid);

            System.out.println("this is the left array" + Arrays.toString(left));
            System.out.println("this is right array" + Arrays.toString(right));

            int[] newLeft = mergeSort(left);
            int[] newRight = mergeSort(right);
            return merge(newLeft, newRight, sortedArr);
        } else {
            return unsortedArr;
        }
    }

    public int[] merge(int[] left, int[] right, int[] arr) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i = i + 1;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        if (i == left.length) {
            System.arraycopy(right, j, arr, k, right.length - j);
            System.out.println("this is is i is equal" + Arrays.toString(arr));
        } else {
            System.arraycopy(left, i, arr, k, left.length - i);
            System.out.println("this is is j is equal" + Arrays.toString(arr));

        }
        return arr;
    }

}

