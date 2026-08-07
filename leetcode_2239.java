class Solution {
    public int findClosestNumber(int[] nums) {

        int closest = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (Math.abs(nums[i]) < Math.abs(closest)) {
                closest = nums[i];
            }

            else if (Math.abs(nums[i]) == Math.abs(closest)
                    && nums[i] > closest) {
                closest = nums[i];
            }
        }

        return closest;
    }
}

// Problem:
// Given an integer array nums, return the number closest to 0.
// If there are multiple numbers equally close to 0, return the larger number.

// Approach:
// 1. Assume the first element is the closest.
// 2. Traverse the remaining elements using a for loop.
// 3. Compare the absolute value (distance from 0) of the current element with the current closest.
// 4. If the current element is closer, update closest.
// 5. If both are equally close, choose the larger (positive) number.

// Time Complexity: O(n)
// Space Complexity: O(1)

// Key Points:
// 1. We assume the first element is the answer initially because we need a valid value to compare against.
// 2. Math.abs() is used only to compare the distance of numbers from 0.
// 3. We never store Math.abs(num); we always store the original number.
// 4. If a number is closer to 0, update 'closest'.
// 5. If two numbers are equally close to 0, choose the larger (positive) one.
// 6. Traverse the array once and keep updating the best answer.

// Pattern Learned:
// • Initialize answer = nums[0].
// • Traverse from index 1.
// • Compare current answer with each element.
// • Update answer whenever a better candidate is found.
// • Use Math.abs() only for comparison, not for storing values.