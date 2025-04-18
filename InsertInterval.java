import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();

        for (int[] interval : intervals) {
            // If the current interval ends before the new interval starts (non-overlapping)
            if (interval[1] < newInterval[0]) {
                result.add(interval);
            }
            // If the current interval starts after the new interval ends (non-overlapping)
            else if (interval[0] > newInterval[1]) {
                result.add(newInterval);
                newInterval = interval; // Set newInterval to current for next iteration
            }
            // Overlapping intervals: merge with newInterval
            else {
                newInterval[0] = Math.min(newInterval[0], interval[0]);
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }
        }

        // Add the last interval
        result.add(newInterval);

        return result.toArray(new int[result.size()][]);
    }
}
