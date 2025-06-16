import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1; // First two terms

        System.out.println("Fibonacci series up to " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " "); // Print current term
            int next = a + b; // Calculate next term
            a = b; // Shift a to b
            b = next; // Shift b to next
        }
    }
}
