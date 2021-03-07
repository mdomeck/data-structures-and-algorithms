package codewars;

import java.util.List;

public class SmileFaces {
    public static int countSmileys(List<String> arr) {
        // Just Smile :)
        int num = 0;
        for(String i : arr) {
            if(i.length() == 2) {
                if ((i.charAt(0) == ':' || i.charAt(0) == ';') && (i.charAt(1) == 'D' || i.charAt(1) == ')')) {
                    num++;
                }
            }
            if(i.length() == 3) {
                if ((i.charAt(0) == ':' || i.charAt(0) == ';') && (i.charAt(1) == '-' || i.charAt(1) == '~') && (i.charAt(2) == 'D' || i.charAt(2) == ')')) {
                    num++;
                }
            }
        }
        return num;
    }
}
