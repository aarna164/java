import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        String choice;

        do {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            System.out.print("Do you want to enter another number? (yes/no): ");
            choice = sc.next();

        } while (choice.equalsIgnoreCase("yes"));

        // Display the final counts
        System.out.println("Total Positive numbers: " + positiveCount);
        System.out.println("Total Negative numbers: " + negativeCount);
        System.out.println("Total Zeros: " + zeroCount);
    }
}
