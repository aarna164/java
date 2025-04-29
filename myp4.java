
import java.util.Arrays;
public class myp4 {
    //array
    public static void main(String[] args){
        int age = 30;
        int physics = 97;
        int chem = 89;
        int eng = 78;
        int[] marks = new int[4];
        marks[0] = 97;
        marks[1] = 89;
        marks[2] = 78;
        //length
        System.out.println(marks.length);
        //sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);
    }
}
