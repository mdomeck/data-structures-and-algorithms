package codewars;

public class flattenAndSort {
    public static int[] flattenAndSort(int[][] array) {
        
        int result[] = new int[array.length * array[0].length];
        int index = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                result[index++] = array[i][j];
            }
        }
        return result;
    }
}
