package challenges.repeatedWord;

import java.util.*;

public class RepeatedWord {

    public static String duplicateWord(String string) throws Exception {

        if (string != null) {

            String input = string.toLowerCase();

            String[] strArray = input.replace(",", "").split(" ");

            HashSet<String> repeatedWords = new HashSet<>();
            for (String str : strArray) {
                if (!repeatedWords.add(str))
                    return str;
            }

        }
        throw new Exception("there is no repeated word");

    }
}

