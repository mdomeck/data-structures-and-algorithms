package dataStructures.utilities;

import java.util.regex.Pattern;

public class MultiBracketValidation {


    public static boolean testForMirrors(String toTest){
        if (toTest.length() == 0) return false;
        if (Pattern.matches("[}\\)\\]]", Character.toString(toTest.charAt(0)))) return false;

        String charToCheck;
                //charToCheck = '';

        for (int i = 0; i < toTest.length(); i++){
           //if (i == toTest.length()-1) return false;
            charToCheck = toTest.substring(i, i + 1);
            System.out.println("We are before the if statement");
            if(Pattern.matches("[\\[{(]", charToCheck)) { //return true;
                System.out.println("we are in the if statement");
                switch (charToCheck){
                    case "{" :
                        for(int j = 0; j < toTest.length(); j++){
                            String endChar = Character.toString(toTest.charAt(j));
                            if (Pattern.matches("[(\\[\\)\\]]", endChar)) return false;
                            if (endChar.equals("}")) {
                                toTest = removeChar(toTest, j);
                                toTest = removeChar(toTest, i);
                               // System.out.println("Here is no {}" + toTest.toString());
                                // return true;
                            } else {

                                System.out.println("we are in the else");

                            }
                            System.out.println("we are after the if");
                        }
                    // CODE
                    case "(" : charToCheck = "(";
                    //CODE
                    case "[" : charToCheck = "[";
                    //CODE
                }

            }
        }
        return true;
    }

private static String removeChar(String toChange, Integer whereToSlice){ // got this helper from Paul
        String front = toChange.substring(0, whereToSlice);
        String back = toChange.substring(whereToSlice + 1);
        return front + back;
}

}
