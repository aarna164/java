import java.util.Scanner;

public class AverageCalculator {

    // Function to calculate the average
    public static double calculateAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking 3 numbers as input from the user
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();

        // Calculating and displaying the average
        double average = calculateAverage(num1, num2, num3);
        System.out.println("The average is: " + average);
    }
}
