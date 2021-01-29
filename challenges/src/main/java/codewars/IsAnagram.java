package codewars;

import java.util.Arrays;

public class IsAnagram {
    public static boolean isAnagram(String test, String original) {

        char[] word1 = test.toLowerCase().toCharArray();
        char[] word2 = original.toLowerCase().toCharArray();

        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1, word2);
    }
}
