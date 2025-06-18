public class MountainArray {

    public static void main(String[] args) {
        int arr[] = {2, 4, 7, 9, 11, 18, 8, 3, 1};
        int arr1[] = {2, 6, 9, 11, 18, 5, 1};
        // boolean ans1 = validMountainArray(arr);
        // System.out.println(ans1);

        // int ans2 = peakIndexInMountainArray(arr);
        // System.out.println(ans2);

        int ans3 = findInMountainArray(arr1, 5);
        System.out.println(ans3);
    }

    static boolean validMountainArray(int[] arr) {
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

    static int findInMountainArray(int arr[], int target){
        int peak = peakIndexInMountainArray(arr);
        System.out.println(peak);

        // find in first half (increasing)
        int start = 0;
        int end = peak-1;
        int mid = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        // find in first half (increasing)
        start = mid+1;
        end = arr.length-1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1; 
        
    }
}
