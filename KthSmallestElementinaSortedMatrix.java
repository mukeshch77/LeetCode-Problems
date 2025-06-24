public class KthSmallestElementinaSortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        // total elements
        int R = matrix.length;
        int C = matrix[0].length;
        int KthIndex = k-1;
        int start = matrix[0][0];
        int end = matrix[R-1][C-1];

        while (start <= end) {
            int assumedKthElement = start + (end - start) / 2;
            // No of elements less than assumed Kth Element.
            // NS -> no of smaller element
            int NS = findSmallerElements(matrix, assumedKthElement);

            if (NS <= KthIndex) {
                start = assumedKthElement + 1;
            }else{
                end = assumedKthElement - 1;
            }
        }
        return start;
    }

    static int findSmallerElements(int matrix[][], int assumedKthElement){
        int noOfSmallerElements = 0;
        // traverse row by row
        for (int i=0; i<matrix.length; i++){
            // matrix[i] -> 0,1,2
            // apply binary search on matrix[i]
            // int arr[] = matrix[i]

            int start = 0;
            int end = matrix[i].length-1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if(matrix[i][mid] <= assumedKthElement){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
            noOfSmallerElements += start;
        }
        return noOfSmallerElements;
    }
}
