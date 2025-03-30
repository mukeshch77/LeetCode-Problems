import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        for (int num : nums) {
            current.add(num);
        }
        generatePermutations(current.size(), current, result);
        return result;
    }

    private void generatePermutations(int n, List<Integer> current, List<List<Integer>> result) {
        if (n == 1) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            generatePermutations(n - 1, current, result);
            if (n % 2 == 0) {
                swap(current, i, n - 1);
            } else {
                swap(current, 0, n - 1);
            }
        }
        generatePermutations(n - 1, current, result);
    }

    private void swap(List<Integer> current, int i, int j) {
        int temp = current.get(i);
        current.set(i, current.get(j));
        current.set(j, temp);
    }
}
