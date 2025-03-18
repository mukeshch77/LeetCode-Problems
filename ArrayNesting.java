public class ArrayNesting {
    public int arrayNesting(int[] nums) {
        int maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != -1) { 
                int start = nums[i], count = 0;
                while (nums[start] != -1) {
                    int temp = start;
                    start = nums[start];
                    count++;
                    nums[temp] = -1;
                }
                maxLength = Math.max(maxLength, count);
            }
        }
        return maxLength;
    }
}
