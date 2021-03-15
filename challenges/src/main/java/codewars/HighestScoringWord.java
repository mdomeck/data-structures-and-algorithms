package codewars;

import java.util.Arrays;
import java.util.Comparator;

public class HighestScoringWord {
    public static String high(String s) {
        return Arrays.stream(s.split(" ")).max(Comparator.comparing(HighestScoringWord::scoreOfWord)).get();
    }

    public static int scoreOfWord(String word) {
        return word.chars().sum() - word.length() * 96;
    }
}
