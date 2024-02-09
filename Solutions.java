public class Solutions {
    public static int[][] scale(int[][] input, int factor){
        int[][] arr= new int[input.length][input[0].length];
        for(int r = 0; r<arr.length; r++) {
            for (int c = 0; c < arr.length; c++) {
                arr[r][c] = factor * input[r][c];
                // loops through everything multiply by factor
            }
        }
        return arr;
    }

    public static int[][] multiply(int[][] input1,int[][] input2){
        int[][] arr= new int[input1.length][input2[0].length];
        for(int a = 0; a<arr.length; a++) {
            for (int b = 0; b < arr[0].length; b++) {
                for (int c=0; c<arr[0].length; c++) {
                    int sum=0;
                    sum+= input1[a][c] * input1[c][a];
                    arr[a][b] = sum;
                    //multiply item in (row, column) by thing in (column, row)
                    // the flipping [b][a] sort of transposes the second matrix to access the values with for loops
                }
            }
        }
        return arr;
    }

    public static int twoXTwoDeterminate(int[][] arr){
        if(arr.length == arr[0].length) {
            int det = arr[0][0] * arr[1][1] - arr[1][0] * arr[0][1];
            //ad-bc
            return det;
        }
        else {
            System.out.println("Invalid Array");
            return 0;
        }

    }

    public static int ThreeXThreeDeterminate(int[][] arr){
        if(arr.length == arr[0].length) {
            int det = arr[0][0]*(arr[1][1]*arr[2][2]-arr[1][2]*arr[2][1])+arr[0][1]*(arr[1][0]*arr[2][2]-arr[1][2]*arr[2][0])+arr[0][2]*(arr[1][0]*arr[2][1]-arr[1][1]*arr[2][0]);
            //3x3 determinate
            return det;
        }
        else {
            System.out.println("Invalid Array");
            return 0;
        }
    }
}
