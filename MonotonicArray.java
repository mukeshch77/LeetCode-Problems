public class MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        // for (int i = 1; i < nums.length; i++) {
        //     if (nums[i] > nums[i - 1]) {
        //         decreasing = false;
        //     }
        //     if (nums[i] < nums[i - 1]) {
        //         increasing = false;
        //     }
        // }

        int i = 1;
        while (i < nums.length) {
            if (nums[i] > nums[i - 1]) {
                decreasing = false;
            }
            if (nums[i] < nums[i - 1]) {
                increasing = false;
            }
            i++;
        }

        return increasing || decreasing;
    }
}
