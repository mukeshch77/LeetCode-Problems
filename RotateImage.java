public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        transpose(matrix, n);

        // reverse rows -> clockwise
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
    }

    public void swap(int matrix[][], int i, int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    public void transpose(int matrix[][], int n){
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                swap(matrix, i, j);
            }
        }
    }
}
