import java.util.Scanner;//asking for a utilities toolbox(mainly scanner tool)

public class myp17 {
    //Reverse the array
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);//input system(System.in)
        System.out.print("Enter size of aaray: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Reversed array:");
        for(int i=n-1; i>=0; i--){
            System.out.print(arr[i] + "");
        }
        }
    }