package codewars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TwoToOne {
    public static String longest (String s1, String s2) {
        String withDuplicates = s1 + s2;
        char[] arr = withDuplicates.toCharArray();
        Arrays.sort(arr);
        System.out.println(arr);

        List<String> duplicatesRemoved = Arrays.asList(arr).stream().distinct().collect(Collectors.toList());

        return duplicatesRemoved;
    }
}
