package Set.HashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ThreeSumHashing {

    public List<List<Integer>> threeSum(int[] nums) {
        // This outer set ensures we don't keep identical triplets (like the outer Memory Box)
        Set<List<Integer>> tripletSet = new HashSet<>();
        int n = nums.length;

        // The Anchor Loop (Holding card A in your left hand)
        for (int i = 0; i < n; i++) {
            
            // The inner Memory Box that resets every time we change our Anchor card
            Set<Integer> hashset = new HashSet<>();
            
            // The Search Loop (Picking up card B)
            for (int j = i + 1; j < n; j++) {
                
                // Calculate exactly what card C we need to reach 0
                int third = -(nums[i] + nums[j]);

                // Check if card C is already in our Memory Box for this round
                if (hashset.contains(third)) {
                    // We found a match! Bundle the three cards together.
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(third);
                    
                    // Sort the three cards so the outer tripletSet can properly detect duplicates
                    Collections.sort(temp);
                    
                    // Submit it to the official record
                    tripletSet.add(temp);
                }
                
                // Throw the current card B into the Memory Box for future checks
                hashset.add(nums[j]);
            }
        }

        // Convert the final set of unique triplets into a standard List for LeetCode
        List<List<Integer>> ans = new ArrayList<>(tripletSet);
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ThreeSumHashing solver = new ThreeSumHashing();
        
        System.out.println("Enter the array elements separated by spaces (e.g., -1 0 1 2 -1 -4):");
        String input = scanner.nextLine().trim();
        
        if (input.isEmpty()) {
            System.out.println("Output: []");
        } else {
            String[] stringNums = input.split("\\s+");
            int[] nums = new int[stringNums.length];
            for (int i = 0; i < stringNums.length; i++) {
                nums[i] = Integer.parseInt(stringNums[i]);
            }
            
            List<List<Integer>> result = solver.threeSum(nums);
            System.out.println("Output: " + result);
        }
        
        scanner.close();
    }
}