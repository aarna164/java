public class diamond {
    public static void main(String[] args) {
        int n = 5; // Size of the pyramid
        // Loop for each row
        for (int i = 1; i <= n; i++) {
            // Loop for leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Loop for numbers in each row
            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
      for (int i = n; i >= 1; i--) {
            // Loop for leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Loop for stars in each row
            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
    
// This code prints a diamond shape using stars. The first loop creates the upper half of the diamond, and the second loop creates the lower half. Each row is centered by printing leading spaces before the stars. The number of stars in each row increases to the middle and then decreases symmetrically.
// The output will look like this for n = 5:
