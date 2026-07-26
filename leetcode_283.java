/*
===========================================================
LeetCode 283 - Move Zeroes
Difficulty: Easy
Language: Java

Problem:
Given an integer array nums, move all 0's to the end while
maintaining the relative order of the non-zero elements.

Note:
- Perform the operation in-place.
- Do not create another array.

Example:
Input:  nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Approach (Two Pointers):
1. Use two pointers:
      left  -> Position to place the next non-zero element.
      right -> Traverses the array.
2. Traverse the array using the right pointer.
3. If nums[right] is non-zero:
      - Swap nums[left] and nums[right].
      - Increment left.
4. By the end of the traversal:
      - All non-zero elements are at the beginning.
      - All zeroes are automatically moved to the end.

Time Complexity: O(n)
- Single traversal of the array.

Space Complexity: O(1)
- No extra array is used.
===========================================================
*/

class Solution {

    public void moveZeroes(int[] nums) {

        // Pointer to place the next non-zero element
        int left = 0;

        // Traverse the array
        for (int right = 0; right < nums.length; right++) {

            // If current element is non-zero
            if (nums[right] != 0) {

                // Swap current element with the left pointer
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                // Move left pointer to the next position
                left++;
            }
        }
    }
}