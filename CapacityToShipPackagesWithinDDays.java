public class CapacityToShipPackagesWithinDDays {
    public int shipWithinDays(int[] weights, int days) {
        // range will be max of array and sum of array
        int start = Integer.MIN_VALUE; // for finding max element
        int end = 0; //sum of array.


        for(int i = 0; i < weights.length; i++){
            if(weights[i] > start){
                start = weights[i];
            }
            end += weights[i];
        }
        int res = -1;

        while (start <= end) {
            // max capacity that can be shipped in one day.
            int mid = start + (end - start) / 2;

            // if shipment is possible then minimize the capacity
            if(isShipmentPossible(weights, mid, days)){
                res = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

        return res;
    }

    public boolean isShipmentPossible(int weights[], int maxCapacity, int days){
        int curDay = 1;
        int capacity = 0;
        for ( int i = 0; i < weights.length; i++){
            capacity += weights[i];
            //if capacity exceed maxCapacity
            if(capacity > maxCapacity){
                // shipped to next day
                curDay++;
                capacity = weights[i];
            }

            if(curDay > days){
                return false;
            }
        }
        return true;
    }
}
