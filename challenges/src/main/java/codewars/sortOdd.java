package codewars;

import java.util.Collections;
import java.util.Vector;

public class sortOdd {
    public static int[] sortArray(int[] array){

        Vector<Integer> oddArr = new Vector<Integer>();
        Vector<Integer> evenArr = new Vector<Integer>();

        for(int i = 0; i < array.length; i++){
            if (i % 2 != 1){
                evenArr.add(array[i]);
            } else {
                oddArr.add(array[i]);
            }
        }
        Collections.sort(oddArr);

        int i = 0;
        for(int j = 0; j < evenArr.size(); j++){
            array[i++] = evenArr.get(j);
        }
        for(int j = 0; j < oddArr.size(); j++){
            array[i++] = oddArr.get(j);
        }

        return array;
    }
}
