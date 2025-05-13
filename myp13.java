import java.util.Scanner;//scanner class is used to take input from user

public class myp13 {
    //sum of all elements
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//sc is an object of Scanner class
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum = " + sum);
    }
 }

