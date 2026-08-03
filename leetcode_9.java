class Solution {
    public boolean isPalindrome(int x) {

        // Negative numbers cannot be palindromes
        if (x < 0) return false;

        int original = x;
        int rev = 0;

        // Reverse the number
        while (x != 0) {
            int rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }

        // Compare original and reversed numbers
        return original == rev;
    }
}