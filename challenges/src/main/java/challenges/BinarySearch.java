package challenges;

public class BinarySearch {
    public boolean someLibraryMethod() {
        return true;
    }

    public int binarySearch(int[] inputArray, int num) {
        int start = 0;
        int end = inputArray.length - 1;
        int mid = (start + end) / 2;
        while (mid != start && mid != end) {
            if (inputArray[mid] == num) {
                return mid;
            } else {
                if (inputArray[mid] < num) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            mid = (start + end) / 2;
        }

    if(inputArray[mid]==num)
    {
        return mid;
    } else {
        return -1;
    }
}
}
