package codewars;

import java.util.ArrayList;

public class Metro {
    public static int countPassengers(ArrayList<int[]> stops) {
        int totalCount = 0;

        for( int i = 0; i < stops.size(); i++){
            int[] currentStop = stops.get(i);
            int gettingOn = currentStop[0];
            int gettingOff = currentStop[1];

            totalCount += gettingOn;
            totalCount -= gettingOff;
        }
        return totalCount;
    }
}
