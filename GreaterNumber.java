
public class GreaterNumber {

    // Function to return the greater of two numbers
import java.util.Scanner;

    public static int getGreater(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
        // Alternatively: return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int greater = getGreater(num1, num2);
        System.out.println("The two numbers are: " + num1 + " and " + num2);
        System.out.println("The greater number is: " + greater);
    }
}
