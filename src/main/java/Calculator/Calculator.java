package Calculator;

public class Calculator {

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0)   {
            throw new IllegalArgumentException("Number cannot be divide by 0");
        }
        return a / b;
    }

    public static int modulo(int a, int b) {
        return a % b;
    }
}