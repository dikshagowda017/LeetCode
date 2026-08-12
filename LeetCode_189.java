class Solution {
    public void rotate(int[] nums, int k) {

        k = k % nums.length;

        for (int r = 0; r < k; r++) {

            int last = nums[nums.length - 1];

            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }

            nums[0] = last;
        }
    }
}

// Problem:
// Rotate an array to the right by k steps.

// Approach:
// 1. Take the last element and store it.
// 2. Shift all other elements one position to the right.
// 3. Put the stored element at index 0.
// 4. Repeat this process k times.

// Pattern Learned:
// • Array shifting
// • Store an element before overwriting it
// • Traverse backwards when shifting elements

// Things I Learned:
// • Start shifting from the end to avoid overwriting values.
// • k % nums.length handles k greater than the array size.
// • This is the simple/brute-force approach.

// Time Complexity: O(n * k)
// Space Complexity: O(1)