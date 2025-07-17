public class SpiralMatrixTwo {
    public int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n];
        int startRow = 0;
        int endRow = n - 1;
        int startCol = 0;
        int endCol = n - 1;
        int val = 1;

        while (startRow <= endRow && startCol <= endCol) {
            // fill first row
            for (int j = startCol; j <= endCol; j++) {
                matrix[startRow][j] = val;
                val++;
            }
            startRow++;

            //fill end col
            for (int i = startRow; i <= endRow; i++) {
                matrix[i][endCol] = val;
                val++;
            }
            endCol--;

            if (startRow <= endRow) {
                // fill end row
                for (int j = endCol; j >= startCol; j--) {
                    matrix[endRow][j] = val;
                    val++;
                }
                endRow--;
            }

            if (startCol <= endCol) {
                // fill first col
                for (int i = endRow; i >= startRow; i--) {
                    matrix[i][startCol] = val;
                    val++;
                }
                startCol++;
            }
        }
        return matrix;
    }
}
