package set.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {
        // Base edge case
        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }

        // Optimization: Ensure nums1 is always the smaller array to minimize HashSet memory
        if (nums1.length > nums2.length) {
            return intersection(nums2, nums1);
        }

        // 1. Calculate pre-sized capacity to prevent table resizing
        int initialCapacity = (int) Math.ceil(nums1.length / 0.75f) + 1;
        Set<Integer> set = new HashSet<>(initialCapacity);

        // 2. Populate set with the smaller array: O(min(n, m))
        for (int num : nums1) {
            set.add(num);
        }

        // 3. Scan the second array and collect matches using the remove-trick
        List<Integer> resultList = new ArrayList<>();
        for (int num : nums2) {
            // remove() returns true if the element was present and has now been removed
            if (set.remove(num)) {
                resultList.add(num);
            }
        }

        // 4. Convert the List to a primitive int[] array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        int[] output = intersection(nums1, nums2);
        System.out.println("Intersection: " + Arrays.toString(output)); // [9, 4]

        int[] a = {1, 2, 2, 1};
        int[] b = {2, 2};
        System.out.println("Intersection: " + Arrays.toString(intersection(a, b))); // [2]
    }
}