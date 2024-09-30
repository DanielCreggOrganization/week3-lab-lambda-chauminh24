package ie.atu.lambda;

public class Main01 {
    public static void main(String[] args) {
        Calculator square = (int x) -> x*x;

        int result = square.calculate(5);
        System.out.println("Square of 5 is: " + result);

    }
}
