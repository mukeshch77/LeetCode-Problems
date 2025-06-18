public class PeakIndexinaMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int  n = arr.length;
        int start = 0;
        int end = n-1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(mid != 0 && mid != n-1 && arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                return mid;
            }else if(mid != n-1 && arr[mid] < arr[mid+1]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
