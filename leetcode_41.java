class Solution {
    public int firstMissingPositive(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            while (nums[i] > 0 &&
                   nums[i] <= n &&
                   nums[i] != nums[nums[i] - 1]) {

                int index = nums[i] - 1;

                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
        }

        for (int i = 0; i < n; i++) {

            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }
}

// Problem:
// Find the smallest positive integer that is missing from the array.

// Approach:
// 1. A number x belongs at index x - 1.
// 2. Ignore numbers <= 0 and numbers greater than n.
// 3. Swap valid numbers into their correct positions.
// 4. Traverse the array again.
// 5. The first index where nums[i] != i + 1 gives the answer.
// 6. If all positions are correct, return n + 1.

// Pattern Learned:
// • Cyclic Sort
// • In-place swapping
// • Number x → index x - 1

// Things I Learned:
// • The answer is between 1 and n + 1.
// • Negative numbers, 0 and numbers > n can be ignored.
// • The array itself can be used instead of extra space.

// Common Mistake:
// • Forgetting the duplicate check before swapping.
// • Using an invalid number as an array index.

// Time Complexity: O(n)
// Space Complexity: O(1)