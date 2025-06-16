public class myp24 {
    // find maximum from two arrays
    public static void main(String[] args) {
        int[] arr1 = {3, 5, 7};
        int[] arr2 = {2, 8, 6};

        // Assuming both arrays are of the same length
        int max = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
            if (arr2[i] > max) {
                max = arr2[i];
            }
        }

        System.out.println("Maximum value from both arrays: " + max);

    }
}
