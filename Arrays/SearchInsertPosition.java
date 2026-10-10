package Arrays;

import java.util.Scanner;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        // O(log n) Binary Search loop
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SearchInsertPosition solver = new SearchInsertPosition();

        // Prompt for the sorted array
        System.out.println("Enter a sorted array of numbers separated by spaces (e.g., 1 3 5 6):");
        String input = scanner.nextLine().trim();

        // Prompt for the target value
        System.out.println("Enter the target number:");
        int target = scanner.nextInt();

        if (input.isEmpty()) {
            System.out.println("Output: 0");
        } else {
            // Convert string input to integer array
            String[] stringNums = input.split("\\s+");
            int[] nums = new int[stringNums.length];
            for (int i = 0; i < stringNums.length; i++) {
                nums[i] = Integer.parseInt(stringNums[i]);
            }

            // Call the method and print the result
            int result = solver.searchInsert(nums, target);
            System.out.println("Output: " + result);
        }

        scanner.close();
    }
}
