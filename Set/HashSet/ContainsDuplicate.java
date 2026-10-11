package Set.HashSet;

import java.util.HashSet;
import java.util.Set;

// Given an array of integers nums,
//  return true if any value appears at least twice in the array,
//  and return false if every element is distinct.
public class ContainsDuplicate {

    public static boolean hasDuplicate(int[] nums) {
        // Base edge case: an array with 0 or 1 elements can never contain duplicates
        if (nums == null || nums.length <= 1) {
            return false;
        }

        // Optimization: Pre-size the HashSet to avoid resizing rehashes
        // Capacity = (expectedElements / loadFactor) + 1
        int initialCapacity = (int) Math.ceil(nums.length / 0.75f) + 1;
        Set<Integer> seen = new HashSet<>(initialCapacity);

        for (int num : nums) {
            if (!seen.add(num)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 1};
        int[] test2 = {1, 2, 3, 4};
        int[] test3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        int[] test4 = {};

        System.out.println("test1 has duplicate: " + hasDuplicate(test1)); // true
        System.out.println("test2 has duplicate: " + hasDuplicate(test2)); // false
        System.out.println("test3 has duplicate: " + hasDuplicate(test3)); // true
        System.out.println("test4 has duplicate: " + hasDuplicate(test4)); // false
    }
}
