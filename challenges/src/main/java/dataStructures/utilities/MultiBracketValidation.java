package dataStructures.utilities;

import java.util.regex.Pattern;

public class MultiBracketValidation {


    public static boolean testForMirrors(String toTest) {
        if (toTest.length() == 0) return false;


        String charToCheck;

        // credit to Paul we worked this code through together
        for (int i = 0; i < toTest.length(); i++) {
            charToCheck = String.valueOf(toTest.charAt(i));
            if (Pattern.matches("[}\\)\\]]", charToCheck)) return false;
            if (Pattern.matches("[\\[{(]", charToCheck)) {
                switch (charToCheck) {
                    case "{":
                        for (int j = 0; j < toTest.length(); j++) {
                            String endChar = Character.toString(toTest.charAt(j));
                            if (Pattern.matches("[(\\[\\)\\]]", endChar)) return false;
                            if (endChar.equals("}")) {
                                toTest = spliceEmptyChar(toTest, j);
                                toTest = spliceEmptyChar(toTest, i);
                                break;
                            }
                        }
                        break;
                    case "(":
                        for (int j = 0; j < toTest.length(); j++) {
                            String endChar = Character.toString(toTest.charAt(j));
                            if (Pattern.matches("[{\\[\\}]]", endChar)) return false;
                            if (endChar.equals(")")) {
                                toTest = spliceEmptyChar(toTest, j);
                                toTest = spliceEmptyChar(toTest, i);
                                break;
                            }
                        }
                    case "[":
                        for (int j = 0; j < toTest.length(); j++) {
                            String endChar = Character.toString(toTest.charAt(j));
                            if (Pattern.matches("[[({})]]", endChar)) return false;
                            if (endChar.equals("]")) {
                                toTest = spliceEmptyChar(toTest, j);
                                toTest = spliceEmptyChar(toTest, i);
                                break;
                            }

                        }
                        break;
                }
            }
        }
        return true;
    }

                private static String spliceEmptyChar (String toChange, Integer whereToSlice){ // got this helper from Paul
                    String front = toChange.substring(0, whereToSlice);
                    String back = toChange.substring(whereToSlice + 1);
                    return front + " " + back;
                }

            }
