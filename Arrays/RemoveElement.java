package Arrays;
import java.util.Scanner;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int insertIndex = 0;
        
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not the value we want to remove
            if (nums[i] != val) {
                // Place it at the insertIndex and move the index forward
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        return insertIndex;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RemoveElement solver = new RemoveElement();
        
        // Prompt for array input
        System.out.println("Enter the array elements separated by spaces (e.g., 0 1 2 2 3 0 4 2):");
        String input = scanner.nextLine().trim();
        
        // Prompt for the value to remove
        System.out.println("Enter the value to remove:");
        int val = scanner.nextInt();
        
        if (input.isEmpty()) {
            System.out.println("Output: 0, nums = []");
        } else {
            // Convert string input to integer array
            String[] stringNums = input.split("\\s+");
            int[] nums = new int[stringNums.length];
            for (int i = 0; i < stringNums.length; i++) {
                nums[i] = Integer.parseInt(stringNums[i]);
            }
            
            // Call the method
            int k = solver.removeElement(nums, val);

            System.out.print("Output: " + k + ", nums = [");
            for (int i = 0; i < nums.length; i++) {
                if (i < k) {
                    System.out.print(nums[i]);
                } else {
                    System.out.print("_");
                }
                if (i < nums.length - 1) System.out.print(",");
            }
            System.out.println("]");
        }
        
        scanner.close();
    }
}