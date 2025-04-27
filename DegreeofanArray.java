import java.util.HashMap;
import java.util.Map;

public class DegreeofanArray {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, int[]> map = new HashMap<>();
        int degree = 0;
        int minLength = nums.length;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (!map.containsKey(num)) {
                // {frequency, firstIndex, lastIndex}
                map.put(num, new int[]{1, i, i});
            } else {
                map.get(num)[0]++;
                map.get(num)[2] = i;
            }

            degree = Math.max(degree, map.get(num)[0]);
        }

        for (int[] arr : map.values()) {
            if (arr[0] == degree) {
                minLength = Math.min(minLength, arr[2] - arr[1] + 1);
            }
        }

        return minLength;
    }
}
