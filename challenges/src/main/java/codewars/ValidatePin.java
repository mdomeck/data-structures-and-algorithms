package codewars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePin {
    public static boolean validatePinKata (String pin) {
        String regex = "^(\\d{4}|\\d{6})";
        //String regex = "\\d\\{4|6\\}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pin);
        if(matcher.matches()){
            return true;
        } else {
            return false;
        }
    }
}
