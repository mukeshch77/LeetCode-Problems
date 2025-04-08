public class SudokuSolver {
    // Helper function to check if it's safe to place a digit at board[row][col]
    boolean isSafe(char[][] board, int row, int col, char dig) {
        // Check horizontal (row)
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == dig) {
                return false;
            }
        }
        
        // Check vertical (column)
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == dig) {
                return false;
            }
        }

        // Check 3x3 grid
        int srow = (row / 3) * 3;
        int scol = (col / 3) * 3;
        for (int i = srow; i < srow + 3; i++) {
            for (int j = scol; j < scol + 3; j++) {
                if (board[i][j] == dig) {
                    return false;
                }
            }
        }
        return true;
    }

    // Backtracking helper function
    boolean helper(char[][] board, int row, int col) {
        // If we've reached the last row, return true
        if (row == 9) {
            return true;
        }

        // Move to the next cell
        int nextRow = row, nextCol = col + 1;
        if (nextCol == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        // If the current cell is already filled, move to the next
        if (board[row][col] != '.') {
            return helper(board, nextRow, nextCol);
        }

        // Try placing digits '1' to '9' in the empty cell
        for (char dig = '1'; dig <= '9'; dig++) {
            if (isSafe(board, row, col, dig)) {
                board[row][col] = dig;
                if (helper(board, nextRow, nextCol)) {
                    return true;
                }
                // Backtrack if placing the digit did not lead to a solution
                board[row][col] = '.'; 
            }
        }

        // If no digit fits, return false (backtrack)
        return false;
    }

    // Main function to solve the Sudoku puzzle
    public void solveSudoku(char[][] board) {
        helper(board, 0, 0); // Start solving from the top-left corner (0, 0)
    }
}
