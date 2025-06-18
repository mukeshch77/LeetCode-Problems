public class MountainArray {
    public boolean validMountainArray(int[] arr) {
        int index = 0;
        int n = arr.length;

        //find all increasing seq (find the peak)
        while (index < n-1){
            if(arr[index] < arr[index+1]){
                index++;
            }else{
                break;
            }
        }
        if(index == 0 || index == n-1){
            return false;
        }

        //find all decreasing seq 
        while (index < n-1){
            if(arr[index] > arr[index+1]){
                index++;
            }else{
                break;
            }
        }
        return (index == n-1);
    }

    static int peakIndexInMountainArray(int arr[]){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(mid != 0 && mid != n-1 && arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                return mid;
            }else if(mid != n-1 && arr[mid] < arr[mid+1]){ // this is increasing half
                start = mid + 1;
            }else{ // thid is dec half
                end = mid - 1;
            }
        }
        return -1;
    }
}
