class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0;
        int countZero = 0;

        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];

            if (nums[i] == 0) {
                countZero++;
            }
        }

        if (xor != 0) {
            return nums.length;
        }

        if (countZero == nums.length) {
            return 0;
        }

        return nums.length - 1;
    }
}

// Problem:
// Find the length of the longest subsequence whose bitwise XOR is non-zero.

// Approach:
// 1. Calculate the XOR of all elements.
// 2. Count the number of zero elements.
// 3. If the total XOR is non-zero, the entire array is the answer.
// 4. If all elements are zero, no valid subsequence exists.
// 5. Otherwise, remove one non-zero element and the answer is n - 1.

// Pattern Learned:
// • Bitwise XOR
// • Array traversal
// • Greedy observation

// Things I Learned:
// • XOR of a number with itself is 0.
// • XOR with 0 does not change the value.
// • If total XOR is non-zero, use the entire array.

// Time Complexity: O(n)
// Space Complexity: O(1)