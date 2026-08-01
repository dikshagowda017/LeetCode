import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        // Stack to store opening brackets
        Stack<Character> stack = new Stack<>();

        // Traverse each character in the string
        for (char ch : s.toCharArray()) {

            // Push opening brackets onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // Process closing brackets
            else {

                // If stack is empty, no matching opening bracket exists
                if (stack.isEmpty()) {
                    return false;
                }

                // Remove the top opening bracket
                char top = stack.pop();

                // Check if the brackets match
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // String is valid only if no unmatched opening brackets remain
        return stack.isEmpty();
    }
}