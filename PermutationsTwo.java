import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsTwo {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> temp = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        generatePermutations(nums, temp, res, used);
        return res;
    }

    private void generatePermutations(int[] nums, List<Integer> temp, List<List<Integer>> res, boolean[] used) {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            // Skip used elements or duplicates that haven't been used yet
            if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) {
                continue;
            }

            used[i] = true;
            temp.add(nums[i]);
            generatePermutations(nums, temp, res, used);
            used[i] = false;
            temp.remove(temp.size() - 1);
        }
    }
}
