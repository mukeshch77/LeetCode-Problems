import java.util.Stack;

public int maximalRectangle(char[][] matrix) {
    // If there are no rows then return
    if (matrix.length == 0) {
        return 0;
    }

    // Find the number of colums in a row.
    int heights[] = new int[matrix[0].length];
    int largest = 0;
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            int val = matrix[i][j] - '0'; // char to integer
            if (val == 0) {
                heights[j] = 0;
            } else {
                heights[j] += val;
            }
        }
        int maxArea = largestRectangleArea(heights);
        if (largest < maxArea) {
            largest = maxArea;
        }
    }
    return largest;
}

public int largestRectangleArea(int[] heights) {
    int n = heights.length;
    int stack[] = new int[n];
    int index = -1;
    int max = 0;
    for (int i = 0; i < n; i++) {
        while (index != -1 && heights[stack[index]] > heights[i]) {
            int h = heights[stack[index--]];
            int ps = (index == -1) ? -1 : stack[index];
            int w = i - ps - 1;
            max = Math.max(max, (h * w));
        }
        stack[++index] = i;
    }
    while (index != -1) {
        int h = heights[stack[index--]];
        int ps = (index == -1) ? -1 : stack[index];
        int w = n - ps - 1;
        max = Math.max(max, (h * w));
    }
    return max;
}
