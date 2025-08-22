public class ConcatenationofArray {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        
        int i = 0;
        while (i < n) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
            i++;
        }

        // for (int i = 0; i < n; i++) {
        //     ans[i] = nums[i];
        //     ans[i + n] = nums[i];
        // }
       
        // for (int i = 0; i < n; i++) {
        //     ans[i + n] = nums[i];
        // }
        
        return ans;
    }
}
