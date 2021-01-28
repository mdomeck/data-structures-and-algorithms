package codewars;

import java.util.Arrays;

public class IsAnagram {
    public static boolean isAnagram(String test, String original) {
        if(test.length() == original.length()) {
            char[] char1 = test.toCharArray();
            char[] char2 = original.toCharArray();

            Arrays.sort(char1);
            Arrays.sort(char2);
        }
            boolean result = Arrays.equals(char1, char2;

            return result;

    }
}
