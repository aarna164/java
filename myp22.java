import java.util.Scanner;
public class myp22 {
    //unique elements from both arrays
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array:");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter size of second array:");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Finding unique elements
        System.out.print("Unique elements: ");
        for (int i = 0; i < n1; i++) {
            boolean isUnique = true;
            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.print(arr1[i] + " ");
            }
        }

        for (int j = 0; j < n2; j++) {
            boolean isUnique = true;
            for (int i = 0; i < n1; i++) {
                if (arr2[j] == arr1[i]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.print(arr2[j] + " ");
            }
        }

        sc.close();
    }

}
