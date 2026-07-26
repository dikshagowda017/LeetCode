/*
===========================================================
LeetCode 628 - Maximum Product of Three Numbers
Difficulty: Easy
Language: Java

Problem:
Given an integer array nums, find three numbers whose product
is maximum and return the maximum product.

Example:
Input:  [1,2,3,4]
Output: 24

Input: [-10,-10,5,2]
Output: 500

Approach:
1. Sort the array in ascending order.
2. There are only two possible maximum products:
   a) Product of the three largest numbers.
   b) Product of the two smallest numbers (most negative)
      and the largest number.
3. Return the larger of the two products.

Why check the first two numbers?
Two negative numbers multiplied together become positive.
So, two very small negative numbers can produce a larger
product than the second and third largest positive numbers.

Time Complexity: O(n log n)
- Sorting the array takes O(n log n).

Space Complexity: O(1)
- No extra space is used (excluding sorting).
===========================================================
*/

import java.util.Arrays;

class Solution {

    public int maximumProduct(int[] nums) {

        // Sort the array in ascending order
        Arrays.sort(nums);

        int n = nums.length;

        // Option 1:
        // Product of the three largest numbers
        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];

        // Option 2:
        // Product of the two smallest (most negative) numbers
        // and the largest number
        int product2 = nums[0] * nums[1] * nums[n - 1];

        // Return the maximum product
        return Math.max(product1, product2);
    }
}