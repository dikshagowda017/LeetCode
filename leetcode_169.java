// Problem:
// Given an array of size n, return the majority element.
// The majority element appears more than ⌊n / 2⌋ times.

// Approach:
// 1. Initialize a candidate and a count.
// 2. If count becomes 0, choose the current element as the new candidate.
// 3. If the current element matches the candidate, increment the count.
// 4. Otherwise, decrement the count.
// 5. The remaining candidate is the majority element.

// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}