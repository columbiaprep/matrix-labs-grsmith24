public class Solutions {
    public static int[][] scale(int[][] input, int factor){
        int[][] arr= new int[input.length][input[0].length];
        for(int r = 0; r<arr.length; r++) {
            for (int c = 0; c < arr.length; c++) {
                arr[r][c] = factor * arr[r][c];
            }
        }
        return arr;
    }

}
