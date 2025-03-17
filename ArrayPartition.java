import java.util.Arrays;

public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        
        int maxSum = 0, i = 0;

        // for (int i = 0; i < nums.length; i += 2) {
        //     maxSum += nums[i];
        // }

        while (i < nums.length) {
            maxSum += nums[i];
            i += 2;
        }
        
        return maxSum;
    }
}
