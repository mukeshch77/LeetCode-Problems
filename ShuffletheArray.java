public class ShuffletheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
     
        // for (int i = 0; i < n; i++) {
        //     result[2 * i] = nums[i]; 
        //     result[2 * i + 1] = nums[i + n];
        // }
        int i = 0;
        while (i < n) {
            result[2 * i] = nums[i]; 
            result[2 * i + 1] = nums[i + n];
            i++;
        }
        
        return result;
    }
}
