public class tovote {
    public static boolean istovote(int age){
        return age >= 18;
    }
    public static void main(String[] args) {
      int age = 20;
      if(istovote(age)){
        System.out.println("eligible to vote");
        
      }  else{
        System.out.println("not eligible to vote");
    }
}

}
