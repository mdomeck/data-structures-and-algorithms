package codewars;

import java.util.Arrays;

public class IsAnagram {
    public static boolean isAnagram(String test, String original) {

        char[] word1 = test.replaceAll("[\\s]", "").toCharArray();
        char[] word2 = original.replaceAll("[\\s]", "").toCharArray();

        Arrays.sort(word1);
        System.out.println(word1);
        Arrays.sort(word2);
        System.out.println(word2);
        return Arrays.equals(word1, word2);
    }
}
