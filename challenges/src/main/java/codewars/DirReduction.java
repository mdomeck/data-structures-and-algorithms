package codewars;

import java.util.ArrayList;
import java.util.Arrays;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        ArrayList<String> result = new ArrayList<>(Arrays.asList(arr));
        int x = findIndex(result);
        while (x != -1) {
            result.remove(x);
            result.remove(x);
            x = findIndex(result);
        }
        return result.toArray(new String[result.size()]);
    }

        static int findIndex(ArrayList<String> result) {
            for(int i = 1; i < result.size(); i++) {
                switch(result.get(i-1)){
                    case "NORTH":
                        if(result.get(i) == "SOUTH") return i-1;
                        break;
                    case "SOUTH":
                        if(result.get(i) == "NORTH") return i-1;
                        break;
                    case "EAST":
                        if(result.get(i) == "WEST") return i-1;
                        break;
                    case "WEST":
                        if(result.get(i) == "EAST") return i-1;
                        break;
                }
            }
        return -1;
        }

}
