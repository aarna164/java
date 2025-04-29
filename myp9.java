public class myp9 {
    public static void main(String[] args){
        //column wise sum
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        for (int j = 0; j < arr[0]. length; j++){//arr[0].length: gives the no.of columns
            int colSum = 0;
            for (int i = 0; i< arr.length; i++){
                colSum += arr[i][j];//+=: compound assignment operator
            }
            System.out.println("Sum of Column" + j + ":" + colSum);
        }
}
}
