public class MyProgram {
    public static void main(String[] args){
        //Non-primitive types
        String name1 = "Aarna";
        String name2 = "Shrivas";
        //concatenate:joining two strings
        String name3 = name1 + name2;
        System.out.println(name3);
        System.out.println(name3.length());
        //charAt
        System.out.println(name3.charAt(0));
        //replace
        String name4 = name3.replace('a',  'b');
        System.out.println(name4);
        //substring
        String name5 = "Aarna and Shrivas";
        System.out.println(name5.substring(0,6));

    }
}
