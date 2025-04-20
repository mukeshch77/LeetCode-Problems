import java.util.Stack;

public class MaximalRectangle {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0;

        int maxArea = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] heights = new int[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == '1') {
                    heights[j]++;
                } else {
                    heights[j] = 0;
                }
            }
            int area = largestRectangleInHistogram(heights);
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    private int largestRectangleInHistogram(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int[] newHeights = new int[heights.length + 1];
        for (int i = 0; i < heights.length; i++) {
            newHeights[i] = heights[i];
        }
        newHeights[heights.length] = 0;

        for (int i = 0; i < newHeights.length; i++) {
            while (!stack.isEmpty() && newHeights[i] < newHeights[stack.peek()]) {
                int height = newHeights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }

        return maxArea;
    }
}
