public class SearchaTwoDMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }

        int m = matrix.length; // rows
        int n = matrix[0].length; // col
        int start= 0;
        int end = m*n-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int r = mid / n;
            int c = mid % n;
            int val = matrix[r][c];

            if (val == target) {
                return true;
            }else if (val < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return false;
    }
}
