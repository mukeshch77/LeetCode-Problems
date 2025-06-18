public class SearchinRotatedSortedArray {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if(target == nums[mid]){
                return mid;
            }
            // check left side is sorted
            if(nums[start] <= nums[mid]){
                // check ans is left side or not??
                if(target >= nums[start] && target < nums[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{// right side is sorted array

                // check ans is left side or not??
                if(target > nums[mid] && target <= nums[end]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
                
            }
        }
        return -1;
    }
}
