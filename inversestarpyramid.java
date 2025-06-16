public class inversestarpyramid {
    public static void main(String[] args) {
        int n = 5; // Size of the pyramid
        // Loop for each row
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
