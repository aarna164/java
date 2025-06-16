public class CompareNumbers {

    // Function to return the greater of two numbers
    public static int getGreater(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    // Main method to test the function
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int greater = getGreater(a, b);
        System.out.println("The greater number is: " + greater);
    }
}



