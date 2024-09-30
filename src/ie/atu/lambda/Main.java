package ie.atu.lambda;

// import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // MathOperation addition = new Addition();
        // System.out.println("Addition: " + addition.operate(int a, int b));

        MathOperation addition = (a, b) -> a + b;
        // Function<String, String> toUpper = s -> s.toUpperCase(); //Java system interface
        StringOperation toUpper = s -> s.toUpperCase();
        System.out.println(("Addition: " + addition.operate(5, 3)));
        System.out.println(toUpper.apply("minh-chau"));

        // Runnable task = new Runnable() {
        //     public void run() {
        //         System.out.println("Thread is running");
        //     }
        // };
        
        // Thread thread = new Thread(task);
        // thread.start();

        Runnable task = () -> System.out.println("Hello from the thread");
        // Thread thread = new Thread(task);
        // thread.start();
        task.run();
    }
}
