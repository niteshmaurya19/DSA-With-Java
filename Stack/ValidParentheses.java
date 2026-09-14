package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {

    public static boolean isValid(String s) {
        // An odd-length string can never have balanced pairs
        if (s == null || s.length() % 2 != 0) {
            return false;
        }

        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            // Push expected closing bracket onto stack when opening bracket is seen
            if (ch == '(') {
                stack.push(')');
            } else if (ch == '{') {
                stack.push('}');
            } else if (ch == '[') {
                stack.push(']');
            } else {
                // If stack is empty (no opening bracket) or mismatch occurs
                if (stack.isEmpty() || stack.pop() != ch) {
                    return false;
                }
            }
        }

        // True if all opened brackets were successfully matched and popped
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String[] testCases = {
            "()",          // Valid: Simple pair
            "()[]{}",      // Valid: Consecutive pairs
            "{[()]}",      // Valid: Nested pairs
            "(]",          // Invalid: Mismatched pair
            "([)]",        // Invalid: Incorrect closing order
            "(((",         // Invalid: Unclosed brackets
            ")("           // Invalid: Closing bracket first
        };

        for (String test : testCases) {
            System.out.printf("Input: %-10s -> Is Valid: %b%n", "\"" + test + "\"", isValid(test));
        }
    }
}