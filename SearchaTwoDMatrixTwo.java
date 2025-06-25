public class SearchaTwoDMatrixTwo {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }
        int Rows = matrix.length;
        int Col = matrix[0].length;
        int r = 0;
        int c = Col-1;

        while (r < Rows && c >= 0) {
            if (matrix[r][c] == target) {
                return true;
            } else if (target < matrix[r][c]) {
                c--;
            } else {
                r++;
            }
        }
        return false;
    }
}
