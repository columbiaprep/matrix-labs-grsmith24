public class Solutions {
    public static int[][] scale(int[][] input, int factor){
        int[][] arr= new int[input.length][input[0].length];
        for(int r = 0; r<arr.length; r++) {
            for (int c = 0; c < arr.length; c++) {
                arr[r][c] = factor * input[r][c];
            }
        }
        return arr;
    }

    public static int[][] multiply(int[][] input1,int[][] input2){
        int[][] arr= new int[input1.length][input2[0].length];
        for(int a = 0; a<arr.length; a++) {
            for (int b = 0; b < arr[0].length; b++) {
                arr[a][b] = input1[a][b]* input1[b][a];
            }
        }
        return arr;
    }

    public static int twoXTwoDeterminate(int[][] input){
        int[][] arr= new int[2][2];
        int det = arr[0][0]*arr[1][1]-arr[1][0]*arr[0][1];
        return det;
    }

    public static int ThreeXThreeDeterminate(int[][] input){
        int[][] arr= new int[3][3];
        int det = arr[0][0]*(arr[1][1]*arr[2][2]-arr[1][2]*arr[2][1])+arr[0][1]*(arr[1][0]*arr[2][2]-arr[1][2]*arr[2][0])+arr[0][2]*(arr[1][0]*arr[2][1]-arr[1][1]*arr[2][0]);
        return det;
    }
}
