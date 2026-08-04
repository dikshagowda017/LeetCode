// Problem:
// Given an array of unique integers that originally contained
// every integer in a continuous range, return all missing
// integers between the smallest and largest elements.

// Approach:
// 1. Find the minimum and maximum values in the array.
// 2. Store all elements in a HashSet for O(1) lookup.
// 3. Traverse every integer between min and max.
// 4. If a number is not present in the HashSet, add it to the result.
// 5. Return the sorted list of missing integers.

// Time Complexity: O(n + (max - min))
// Space Complexity: O(n)

import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            set.add(num);
        }

        List<Integer> result = new ArrayList<>();

        for (int i = min + 1; i < max; i++) {
            if (!set.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }
}