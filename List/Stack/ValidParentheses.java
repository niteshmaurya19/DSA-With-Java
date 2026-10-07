package List.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {

    public static boolean isValid(String s) {
        
        if (s == null || s.length() % 2 != 0) {
            return false;
        }

        // Modern Java stack standard: Deque backed by ArrayDeque
        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(')');
            } else if (ch == '{') {
                stack.push('}');
            } else if (ch == '[') {
                stack.push(']');
            } else {
                // If we encounter a closing bracket:
                // 1. stack.isEmpty() -> Edge Case 2: premature closing bracket (e.g., "]" or ")(")
                // 2. stack.pop() != ch -> Edge Case 3: mismatched bracket type (e.g., "(]")
                if (stack.isEmpty() || stack.pop() != ch) {
                    return false;
                }
            }
        }

        // Edge Case 4: If stack is not empty, there are leftover open brackets (e.g., "(()")
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Test suite covering valid structures and all edge cases
        String[] testCases = {
            "()[]{}",      // true  - standard alternating pairs
            "{[()]}",      // true  - nested brackets
            "(]",          // false - type mismatch
            "([)]",        // false - wrong closing order
            "(((",         // false - unclosed opening brackets
            ")(",          // false - premature closing bracket
            "",            // true  - empty string is balanced
            "({[]})"       // true  - deeply nested
        };

        for (String test : testCases) {
            System.out.printf("%-10s -> %b%n", "\"" + test + "\"", isValid(test));
        }
    }
}
