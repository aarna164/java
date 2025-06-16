public class hollowrhombus {
    public static void main(String[] args) {
        int n = 5; // Size of the rhombus
        // Loop for each row
        for (int i = 1; i <= n; i++) {
            // Loop for leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Loop for stars and spaces in each row
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || i == 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
