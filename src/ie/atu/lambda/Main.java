package ie.atu.lambda;

public class Main {
    public static void main(String[] args) {
        MathOperation addition = new Addition();
        System.out.println("Addition: " + addition.operate(int a, int b));
    }
}
