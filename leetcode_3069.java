class Solution {
    public int[] resultArray(int[] nums) {

        int n = nums.length;

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        int size1 = 0;
        int size2 = 0;

        arr1[size1++] = nums[0];
        arr2[size2++] = nums[1];

        for (int i = 2; i < n; i++) {

            if (arr1[size1 - 1] > arr2[size2 - 1]) {
                arr1[size1++] = nums[i];
            } else {
                arr2[size2++] = nums[i];
            }
        }

        int[] result = new int[n];

        int index = 0;

        for (int i = 0; i < size1; i++) {
            result[index++] = arr1[i];
        }

        for (int i = 0; i < size2; i++) {
            result[index++] = arr2[i];
        }

        return result;
    }
}

// Problem:
// Distribute elements into two arrays according to the given rules,
// then concatenate the two arrays.

// Approach:
// 1. Put the first element in arr1 and the second in arr2.
// 2. For every remaining element, compare the last elements of arr1 and arr2.
// 3. Put the current element into the array with the larger last element.
// 4. Concatenate arr1 and arr2 to form the result.

// Pattern Learned:
// • Array traversal
// • Maintaining two separate arrays
// • Comparing the last elements

// Things I Learned:
// • size1 and size2 keep track of the next empty position.
// • size1 - 1 gives the last element of arr1.
// • size2 - 1 gives the last element of arr2.

// Time Complexity: O(n)
// Space Complexity: O(n)