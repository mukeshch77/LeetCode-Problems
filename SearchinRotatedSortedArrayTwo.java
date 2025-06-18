public class SearchinRotatedSortedArrayTwo {
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if(target == nums[mid]){
                return true;
            }

            /* if start, mid and end all are same then we can't guarentee which part is sorted so we will trim down the space */
            if(nums[start] == nums[mid] && nums[mid] == nums[end]){
                start++;
                end--;
            }else if(nums[start] <= nums[mid]){
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
        return false;
    }
}
