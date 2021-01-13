package codewars;

import java.util.Arrays;
import java.util.HashSet;


public class TwoToOne {
    public static String longest (String s1, String s2) {
//        StringBuilder sb = new StringBuilder();
//        (s1 + s2).chars().distinct().sorted().forEach(c -> sb.append((char) c));
//        return sb.toString();
//    }

//
//            String s = s1 + s2;
//        System.out.println(s.chars().distinct().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString());
//            return s.chars().distinct().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

        String withDuplicates = s1 + s2;
        HashSet<Character> removeDup = new HashSet();
        for(char letter : withDuplicates.toCharArray()){
            removeDup.add(letter);
        }
        Object[] arr = removeDup.toArray();
        Arrays.sort(arr);
        StringBuilder duplicatesRemoved = new StringBuilder();
        for(Object letter : arr){
            duplicatesRemoved.append(letter);
        }
        return duplicatesRemoved.toString();
    }

       // List<Object> duplicatesRemoved = Arrays.asList(arr).stream().distinct().collect(Collectors.toList());
       // System.out.println(duplicatesRemoved);
}
