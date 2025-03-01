import java.util.Scanner;

class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int count = 0, i = 0;
        
        // for (int i = 0; i < nums.length; i++) {
        // if (nums[i] != val) {
        // nums[count++] = nums[i];
        // }
        // }
        // return count;

        while (i < nums.length) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the given size
        int[] nums = new int[size];

        // Enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        // enter the value to be removed
        System.out.print("Enter the value to remove: ");
        int val = scanner.nextInt();

        RemoveElement removeElement = new RemoveElement();

        // Call the removeElement method and get the new length of the array
        int newLength = removeElement.removeElement(nums, val);

        // Print the updated array
        System.out.println("Updated array:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }

        scanner.close();
    }
}
