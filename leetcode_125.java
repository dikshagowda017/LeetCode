class Solution {
    public boolean isPalindrome(String s) {

        // Convert the string to lowercase for case-insensitive comparison
        s = s.toLowerCase();

        // Initialize two pointers
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // Skip non-alphanumeric characters from the left
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }

            // Skip non-alphanumeric characters from the right
            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }

            // If characters don't match, it's not a palindrome
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            // Move both pointers inward
            left++;
            right--;
        }

        // All characters matched
        return true;
    }
}