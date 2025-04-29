public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                result[start++] = num; // Place even numbers at the beginning
            } else {
                result[end--] = num; // Place odd numbers at the end
            }
        }

        return result;
    }
}
