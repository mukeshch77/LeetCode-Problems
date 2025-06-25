import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int startRow = 0;
        int endRow = m - 1;
        int startCol = 0;
        int endCol = n - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // first row
            for (int j = startCol; j <= endCol; j++) {
                res.add(matrix[startRow][j]);
            }
            startRow++;

            // end col
            for (int i = startRow; i <= endRow; i++) {
                res.add(matrix[i][endCol]);
            }
            endCol--;

            if (startRow <= endRow) {
                // end row
                for (int j = endCol; j >= startCol; j--) {
                    res.add(matrix[endRow][j]);
                }
                endRow--;
            }

            if (startCol <= endCol) {
                // first col
                for (int i = endRow; i >= startRow; i--) {
                    res.add(matrix[i][startCol]);
                }
                startCol++;
            }
        }
        return res;
    }
}
