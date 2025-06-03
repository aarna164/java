import java.util.Scanner;
//Compare Two Arrays
public class myp19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter size of array:");
        int n= sc.nextInt();//size of arrays
        int[] arr1 = new int[n];// arr1 =[0,0,0]
        int[] arr2 = new int[n];// arr2 =[0,0,0]
        boolean isEqual = java.util.Arrays.equals(arr1, arr2);//Since both arrays contain [0, 0, 0] initially, this returns true.
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
