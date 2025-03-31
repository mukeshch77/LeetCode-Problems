public class RemoveDuplicatesfromSortedArrayTwo {

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int index = 2; // Start from the third position

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index - 2]) { // Check if it's allowed to include
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }

}
