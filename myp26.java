
import java.util.Scanner;

public class myp26 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            case 4:
                System.out.println("Hola");
                break;
            case 5:
                System.out.println("Ciao");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
