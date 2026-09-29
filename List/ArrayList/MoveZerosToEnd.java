package List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZerosToEnd {

    public static void moveZeros(List<Integer> list) {
        if (list == null || list.size() <= 1) {
            return;
        }

        int nonZeroIndex = 0;

        // Pass 1: Shift all non-zero elements to the front
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != 0) {
                list.set(nonZeroIndex, list.get(i));
                nonZeroIndex++;
            }
        }

        // Pass 2: Fill all remaining positions with zero
        while (nonZeroIndex < list.size()) {
            list.set(nonZeroIndex, 0);
            nonZeroIndex++;
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(0, 1, 0, 3, 12));
        System.out.println("Original: " + numbers);

        moveZeros(numbers);
        System.out.println("Modified: " + numbers);

        // Edge case tests
        List<Integer> allZeros = new ArrayList<>(Arrays.asList(0, 0, 0));
        moveZeros(allZeros);
        System.out.println("All Zeros: " + allZeros);

        List<Integer> noZeros = new ArrayList<>(Arrays.asList(4, 5, 6));
        moveZeros(noZeros);
        System.out.println("No Zeros:  " + noZeros);
    }
}