import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        
        if (nums == null || nums.length == 0) {
            return result;
        }
        
        int start = nums[0];
        for (int i = 1; i <= nums.length; i++) {
            // Check if we have reached the end of the array or a non-consecutive number
            if (i == nums.length || nums[i] != nums[i - 1] + 1) {
                // If it's just one number
                if (start == nums[i - 1]) {
                    result.add(String.valueOf(start));
                } else {
                    // If it's a range
                    result.add(start + "->" + nums[i - 1]);
                }
                // Set the new start for the next range
                if (i < nums.length) {
                    start = nums[i];
                }
            }
        }
        
        return result;
    }
}
