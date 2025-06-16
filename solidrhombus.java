public class solidrhombus {
    public static void main(String[] args) {
        int n = 5;
        // Loop for each row
        for (int i = 1; i <= n; i++) {
            // Loop for leading spaces
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            // Loop for stars in each row
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
