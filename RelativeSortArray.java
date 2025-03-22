import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> countMap = new HashMap<>();
        
        for (int num : arr1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        int index = 0;
        for (int num : arr2) {
            if (countMap.containsKey(num)) {
                int count = countMap.get(num);
                for (int i = 0; i < count; i++) {
                    arr1[index++] = num;
                }
                countMap.remove(num);
            }
        }

        List<Integer> remaining = new ArrayList<>();
        for (int num : countMap.keySet()) {
            int count = countMap.get(num);
            for (int i = 0; i < count; i++) {
                remaining.add(num);
            }
        }
        
        Collections.sort(remaining);
        for (int num : remaining) {
            arr1[index++] = num;
        }
        
        return arr1;
    }
}
