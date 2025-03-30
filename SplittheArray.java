public class SplittheArray {
    class Solution {
        public boolean isPossibleToSplit(int[] nums) {
            Arrays.sort(nums);
            
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == nums[i - 1] && (i + 1 < nums.length && nums[i] == nums[i + 1])) {
                    return false;
                }
            }
            
            return true;
        }
    }
    
    }
    