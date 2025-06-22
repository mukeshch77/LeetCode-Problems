public class SingleElementinaSortedArray {
    static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length-2;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // left half
            if(nums[mid] == nums[mid^1]){
                start = mid + 1;
            }else{// right half
                end = mid - 1;
            }          
        }
        return nums[start];
    }
}
