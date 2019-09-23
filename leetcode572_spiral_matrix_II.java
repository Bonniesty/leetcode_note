public class leetcode572_spiral_matrix_II {


    //set boundary
    public int[][] generateMatrix(int n) {

        int[][] res = new int[n][n];
        int startCol = 0;
        int endCol = n-1;
        int startRow = 0;
        int endRow = n-1;
        int count = 1;
        while(startCol <= endCol && startRow <= endRow){


            for(int i = startCol; i<= endCol; i++){
                res[startRow][i] = count++;
            }
            startRow++;

            for(int j = startRow; j<= endRow; j++){
                res[j][endCol] = count++;
            }
            endCol--;

            for(int i = endCol; i >= startCol; i--){
                res[endRow][i] = count++;
            }
            endRow--;

            for(int j = endRow; j>= startRow; j--){
                res[j][startCol] = count++;
            }
            startCol++;


        }
        return res;



    }
}
