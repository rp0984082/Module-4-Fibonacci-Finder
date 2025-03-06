import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer for Fibonacci position: ");

        if (scanner.hasNextInt()) {
            int position = scanner.nextInt();
            if (position >= 0) {
                System.out.println("The Fibonacci number in position " + position + " is " + fibonacci(position) + ".");
            } else {
                System.out.println("Please enter a non-negative integer.");
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }

        scanner.close();
    }

    // Recursive function to calculate Fibonacci number
    private static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
