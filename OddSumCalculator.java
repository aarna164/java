//Write a function to print the sum of all odd numbers from 1 to n.
public class OddSumCalculator {

    // Function to calculate and print the sum of all odd numbers from 1 to n
    public static void sumOfOdds(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) { // Only odd numbers
            sum += i;
        }
        System.out.println("Sum of odd numbers from 1 to " + n + " is: " + sum);
    }

    public static void main(String[] args) {
        int n = 10; // You can change this or take input from the user
        sumOfOdds(n);
    }
}
