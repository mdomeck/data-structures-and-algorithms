package codewars;

public class Line {
    public static String Tickets(int[] peopleInLine) {
        int p25 = 0;
        int p50 = 0;

        for(int i = 0; i < peopleInLine.length; i++) {
            if(peopleInLine[i] == 25) {
                p25++;
            }
            if(peopleInLine[i] == 50) {
                p25--;
                p50++;
            }
            if(peopleInLine[i] == 100) {
                if(p50 > 0) {
                    p50--;
                    p25--;
                } else {
                    p25 -= 3;
                }
            }
            if(p25 < 0) {
                return "NO";
            }
        }
        return "YES";
    }
}
