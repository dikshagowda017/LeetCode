// Problem:
// Given a non-empty array where every element appears twice
// except for one, find that single element.

// Approach:
// 1. Initialize result as 0.
// 2. Traverse the array and perform XOR with each element.
// 3. Duplicate numbers cancel each other out (a ^ a = 0).
// 4. The remaining value is the single number.
// 5. Return the result.

// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;
    }
}