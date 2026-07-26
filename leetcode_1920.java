/*
===========================================================
LeetCode 1920 - Build Array from Permutation
Difficulty: Easy
Language: Java

Problem:
Given a zero-based permutation nums (0-indexed), build an
array ans of the same length where:

    ans[i] = nums[nums[i]]

Return the newly built array.

Example:
Input:  nums = [0,2,1,5,3,4]
Output: [0,1,2,4,5,3]

Approach:
1. Create a new array 'ans' of the same size as nums.
2. Traverse the array once.
3. For every index i:
      ans[i] = nums[nums[i]]
4. Return the answer array.

Time Complexity: O(n)
- Traverse the array only once.

Space Complexity: O(n)
- Extra array is used to store the result.
===========================================================
*/

class Solution {

    public int[] buildArray(int[] nums) {

        // Create a new array to store the answer
        int[] ans = new int[nums.length];

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {

            // Store the value present at index nums[i]
            ans[i] = nums[nums[i]];
        }

        // Return the newly built array
        return ans;
    }
}