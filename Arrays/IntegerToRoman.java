package Arrays;

import java.util.Scanner;

public class IntegerToRoman {

    public String intToRoman(int num) {
        // Define all standard and subtractive Roman numeral combinations in descending order
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        // StringBuilder is much faster and more memory-efficient than string concatenation (+=)
        StringBuilder roman = new StringBuilder();
        
        // Loop through the values from largest to smallest
        for (int i = 0; i < values.length; i++) {
            
            // While the current number is greater than or equal to the value,
            // we can subtract this value and append its symbol.
            while (num >= values[i]) {
                num -= values[i];
                roman.append(symbols[i]);
            }
        }
        
        return roman.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntegerToRoman solver = new IntegerToRoman();
        
        System.out.println("Enter an integer between 1 and 3999:");
        
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            
            // Validate the input constraint
            if (num >= 1 && num <= 3999) {
                String result = solver.intToRoman(num);
                System.out.println("Output: \"" + result + "\"");
            } else {
                System.out.println("Please enter a valid number within the constraints.");
            }
        }
        
        scanner.close();
    }
}