package challenges.leftJoin;

import java.util.*;

public class LeftJoin {

    String[][] joinArray;

    public String[][] leftJoin(HashMap synonym, HashMap antonym) {

        joinArray = new String[synonym.size()][];
        List<String> keys = new ArrayList<>(synonym.keySet());

        for (int i = 0; i < synonym.size(); i++) {
            joinArray[i] = new String[3];
            joinArray[i][0] = keys.get(i);
            joinArray[i][1] = synonym.get(keys.get(i)).toString();

            if(antonym.containsKey(keys.get(i))){
                joinArray[i][2] = antonym.get(keys.get(i)).toString();
            }
        }
        return joinArray;
    }


    public String toString(){

        String string = "[";

        for(int i = 0; i < joinArray.length; i++){
            string += "[";
            for(int j = 0; j < joinArray[i].length; j++){
                string += joinArray[i][j] + ", ";
            }
            string += "]";
        }
        string += "]";

        return string;
    }


}
