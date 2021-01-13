package codewars;

public class ArithmeticFunction {
    public static int arithmetic(int a, int b, String operator) {
        int total = 0;
        if (operator == "add"){
            total = a + b;
        }
        if (operator == "subtract"){
            total = a - b;
        }
        if (operator == "divide"){
            total = a/b;
        }
        if (operator == "multiply"){
            total = a*b;
        }
        return total;
    }
}
