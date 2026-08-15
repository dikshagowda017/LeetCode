class Solution {
    public int maxNumberOfBalloons(String text) {

        int[] count = new int[26];

        for (int i = 0; i < text.length(); i++) {
            count[text.charAt(i) - 'a']++;
        }

        count['l' - 'a'] /= 2;
        count['o' - 'a'] /= 2;

        return Math.min(
            Math.min(count['b' - 'a'], count['a' - 'a']),
            Math.min(
                Math.min(count['l' - 'a'], count['o' - 'a']),
                count['n' - 'a']
            )
        );
    }
}

// Problem:
// Find the maximum number of times the word "balloon" can be formed
// using characters from the given string.

// Approach:
// 1. Count the frequency of every character.
// 2. "balloon" needs b, a and n once, and l and o twice.
// 3. Divide the counts of l and o by 2.
// 4. The smallest required count determines the answer.

// Pattern Learned:
// • Frequency counting
// • Finding the limiting frequency

// Things I Learned:
// • int[26] can store lowercase character frequencies.
// • 'c' - 'a' gives the index of a character.
// • Characters needed multiple times must be divided accordingly.

// Common Mistake:
// • Forgetting that l and o appear twice in "balloon".

// Time Complexity: O(n)
// Space Complexity: O(1)