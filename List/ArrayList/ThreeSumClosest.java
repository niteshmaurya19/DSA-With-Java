package List.ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];


        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                if (Math.abs(target - currentSum) < Math.abs(target - closestSum)) {
                    closestSum = currentSum;
                }

                if (currentSum < target) {
                    left++;
                } else if (currentSum > target) {
                    right--;
                } else {
                    return currentSum;
                }
            }
        }
        return closestSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ThreeSumClosest solver = new ThreeSumClosest();
        
        System.out.println("Enter the array elements separated by spaces (e.g., -1 2 1 -4):");
        String input = scanner.nextLine().trim();
    
        System.out.println("Enter the target number:");
        int target = scanner.nextInt();
        
        if (!input.isEmpty()) {
            // Convert string input to integer array
            String[] stringNums = input.split("\\s+");
            int[] nums = new int[stringNums.length];
            for (int i = 0; i < stringNums.length; i++) {
                nums[i] = Integer.parseInt(stringNums[i]);
            }
            
            // Call the method and print the result
            int result = solver.threeSumClosest(nums, target);
            System.out.println("Output: " + result);
        }
        
        scanner.close();
    }
}