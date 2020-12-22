// thanks to Paul

import java.util.Arrays;

public class ArrayReverse{
public static void main(String[] args) {

int[] firstArray = new int[]{1, 2, 3, 4, 5, 6};

int[] newReversed = reversedArray(firstArray);

System.out.println(Arrays.toString(newReversed));

}

public static int[] reversedArray(int[] firstArray){
  int newLength = firstArray.length;
  int[] reversed = new int[newLength];
  for (int i = 0; i < firstArray.length; i++){
    reversed[firstArray.length - i -1] = firstArray[i];
  }
  return reversed;
}
}