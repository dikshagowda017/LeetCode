class Solution {
    public int maximumLengthSubstring(String s) {

        int[] count = new int[26];

        int left = 0;
        int answer = 0;

        for (int right = 0; right < s.length(); right++) {

            int index = s.charAt(right) - 'a';
            count[index]++;

            // If a character appears more than twice,
            // move left until it becomes valid again.
            while (count[index] > 2) {

                int leftIndex = s.charAt(left) - 'a';
                count[leftIndex]--;

                left++;
            }

            answer = Math.max(answer, right - left + 1);
        }

        return answer;
    }
}

// Problem:
// Find the longest substring where every character appears at most twice.

// Approach:
// 1. Use a sliding window with left and right pointers.
// 2. Expand the window using right.
// 3. Count the frequency of each character.
// 4. If any character appears more than twice, move left.
// 5. Keep track of the maximum valid window length.

// Pattern Learned:
// • Sliding Window
// • Two Pointers
// • Frequency Counting

// Things I Learned:
// • right expands the window.
// • left shrinks the window when the condition is violated.
// • right - left + 1 gives the current window length.
// • A frequency array can track lowercase letters efficiently.

// Common Mistake:
// • Forgetting to decrease the count when moving left.
// • Using right - left instead of right - left + 1.

// Time Complexity: O(n)
// Space Complexity: O(1)