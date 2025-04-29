public class myp11 {
    String[] str={"B","A","C"};
    public static void main(String[] args){
        //Sorting a string array
        String[] str={"B","A","C"};
        for (int i = 0; i< str.length; i++){
            for (int j = i+1; j< str.length; j++){
                if (str[i].compareTo(str[j])>0){
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        for (String s : str){
            System.out.print(s + " ");
        }
}
}
