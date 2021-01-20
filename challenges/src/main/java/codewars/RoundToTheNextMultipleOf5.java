package codewars;

public class RoundToTheNextMultipleOf5 {
    public static int roundToNext5(int number) {
        if(number % 5 == 0){
            System.out.println(number);
            return number;
        } else {
            return (number/5 + 1)*5;
        }

    }
}
