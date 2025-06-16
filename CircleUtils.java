public class CircleUtils {
    public static double calculateCircumference(double radius){
        return 2 * Math.PI * radius;
    }
    //main method to test the function
    public static void main(String[] args) {
      double r = 5.0;
      double result = calculateCircumference(r);
        System.out.println("The circumference of the circle with radius " + r + " is: " + result);  
    }
}

