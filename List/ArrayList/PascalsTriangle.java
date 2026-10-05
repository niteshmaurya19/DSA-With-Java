package List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows <= 0) {
            return triangle;
        }

        for (int r = 0; r < numRows; r++) {
            List<Integer> currentRow = new ArrayList<>(r + 1);

            for (int c = 0; c <= r; c++) {
                // First and last values in every row are always 1
                if (c == 0 || c == r) {
                    currentRow.add(1);
                } else {
                    // Fetch the previous row from our outer list
                    List<Integer> prevRow = triangle.get(r - 1);

                    // Sum the two numbers directly above
                    int val = prevRow.get(c - 1) + prevRow.get(c);
                    currentRow.add(val);
                }
            }

            // Append the fully constructed row into the triangle
            triangle.add(currentRow);
        }

        return triangle;
    }

    public static void main(String[] args) {
        int rows = 5;
        List<List<Integer>> result = generate(rows);

        System.out.println("Standard List Representation:");
        System.out.println(result);

        System.out.println("\nFormatted Triangle Output:");
        for (int i = 0; i < result.size(); i++) {
            // Print leading spaces for triangular alignment
            for (int s = 0; s < rows - i - 1; s++) {
                System.out.print("  ");
            }
            for (int val : result.get(i)) {
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
    }
}