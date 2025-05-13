import java.util.Scanner;
//Compare Two Arrays
public class myp19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter size of array:");
        int n= sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        boolean isEqual = java.util.Arrays.equals(arr1, arr2);
 if (isEqual) {
    System.out.println("Arrays are equal");
 } else {
    System.out.println("Arrays are not equal");
 }
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        isEqual = java.util.Arrays.equals(arr1, arr2);
        if (isEqual) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
        sc.close();

    }
    
}
