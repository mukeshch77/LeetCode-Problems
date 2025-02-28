import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        // for (int i = 0; i < nums.length - 1; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             return new int[] { i, j };
        //         }
        //     }
        // }
        // return new int[] {};

        // Create a HashMap to store the numbers we've seen and their respective indices
        HashMap<Integer, Integer> hMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
        // Calculate the complement value we are looking for
        int comp = target - nums[i];

        // Check if the complement already exists in the map
        if (hMap.containsKey(comp)) {
        // If found, return the indices of the current number and the complement
        return new int[] { hMap.get(comp), i };
        }

        // If not found, store the current number and its index in the map
        hMap.put(nums[i], i);
        }

        // If no solution is found, return an empty array
        return new int[] {};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Declare the array to store the numbers
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();

        // call the twoSum method
        TwoSum ts = new TwoSum();
        int[] result = ts.twoSum(nums, target);

        // Output the result
        if (result.length == 0) {
            System.out.println("No solution found.");
        } else {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        }

        scanner.close();
    }
}
