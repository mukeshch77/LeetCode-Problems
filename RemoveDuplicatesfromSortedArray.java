import java.util.Scanner;

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 0;

        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[j] != nums[i])
        //         nums[++j] = nums[i];
        // }
        // return ++j;

        while (i < nums.length) {
            if (nums[j] != nums[i])
                nums[++j] = nums[i];
            i++;
        }
        return ++j;
    }
}

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        // Initialize the array with the given number of elements
        int[] nums = new int[n];
        
       
        System.out.println("Enter the elements of the array (sorted in non-decreasing order):");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        // Create an instance of the Solution class
        Solution solution = new Solution();
        
        // Call the removeDuplicates method
        int k = solution.removeDuplicates(nums);
        
        // Output the number of unique elements
        System.out.println("Number of unique elements: " + k);
        
        System.out.print("Updated array with unique elements: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        
        scanner.close();
    }
}
