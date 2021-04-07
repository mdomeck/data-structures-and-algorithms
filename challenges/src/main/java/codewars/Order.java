package codewars;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Order {
    public static String order(String words) {
        List<Character> numbers = new ArrayList<Character>(Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9'));
        StringTokenizer str = new StringTokenizer(words);
        String[] stringWords = new String[str.countTokens()];

        while(str.hasMoreTokens()) {
            String currentWord = str.nextToken();
            for (int i = 0; i < currentWord.length(); i++) {
                if (numbers.contains(currentWord.charAt(i))) {
                    stringWords[numbers.indexOf(currentWord.charAt(i))] = currentWord;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String s: stringWords) {
            sb.append(s + ' ');
        }
        return sb.toString().trim();
    }
}
