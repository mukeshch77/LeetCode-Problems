public class SortColors {
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public void sortColors(int[] nums) {
        int start = 0, end = nums.length - 1, index = 0;

        while (index <= end) {
            if (nums[index] == 0) {
                swap(nums, index, start);
                start++;
                index++;  // Move index forward as swapped value is processed
            } else if (nums[index] == 2) {
                swap(nums, index, end);
                end--; 
                // Do NOT increment index here to check the swapped value at index
            } else {
                index++;  // If 1, just move forward
            }
        }
    }
}
