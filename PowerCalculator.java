public class PowerCalculator {

    // Function to calculate x^n using loop
    public static int power(int x, int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;

        int value = power(x, n);
        System.out.println(x + " raised to the power " + n + " is: " + value);
    }
}
