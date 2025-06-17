public class ValidMountainArray {
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
}
