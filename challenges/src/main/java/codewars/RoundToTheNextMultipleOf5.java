package codewars;

public class RoundToTheNextMultipleOf5 {
    public static int roundToNext5(int number) {
        if (number % 5 == 0) {
            return number;
        }
        return (number > 0) ? (number / 5 + 1) * 5 : (number / 5) * 5;
    }
}

