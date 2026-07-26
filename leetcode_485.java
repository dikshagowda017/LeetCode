/*
===========================================================
LeetCode 485 - Max Consecutive Ones
Difficulty: Easy
Language: Java

Problem:
Given a binary array nums, return the maximum number of
consecutive 1's in the array.

Example:
Input:  nums = [1,1,0,1,1,1]
Output: 3

Explanation:
The first sequence of consecutive 1's has length 2.
The second sequence has length 3.
The maximum consecutive 1's is 3.

Approach:
1. Initialize two variables:
      count -> current consecutive 1's
      max   -> maximum consecutive 1's found
2. Traverse the array.
3. If the current element is 1:
      - Increase count.
      - Update max using Math.max().
4. If the current element is 0:
      - Reset count to 0.
5. Return max.

Time Complexity: O(n)
- Single traversal of the array.

Space Complexity: O(1)
- Only two integer variables are used.
===========================================================
*/

class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {

        // Stores current consecutive count of 1's
        int count = 0;

        // Stores the maximum consecutive count found
        int max = 0;

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {

            // If current element is 1
            if (nums[i] == 1) {

                // Increase the current streak
                count++;

                // Update the maximum streak
                max = Math.max(max, count);

            } else {

                // Reset streak when 0 is encountered
                count = 0;
            }
        }

        // Return the maximum consecutive 1's
        return max;
    }
}