// Problem:
// Merge two strings alternately. Append remaining characters if one string is longer.

// Key Idea:
// Traverse both strings simultaneously using one index.

// Approach:
// 1. Use StringBuilder to efficiently build the answer.
// 2. Traverse using a single index (i).
// 3. Check if i is within word1 before appending.
// 4. Check if i is within word2 before appending.
// 5. Continue until both strings are completely traversed.

// Pattern Learned:
// • Two strings + simultaneous traversal.
// • Boundary checking before accessing characters.
// • Use StringBuilder when repeatedly appending characters.

// Why StringBuilder?
// • Strings are immutable.
// • append() modifies the same object.
// • More efficient than String concatenation (+).

// Common Mistake:
// • Using && instead of || in the while loop.
// • Forgetting to append the remaining characters.
// • Using String instead of StringBuilder.

// Time Complexity: O(n + m)
// Space Complexity: O(n + m)

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0 ;

        while( i < word1.length() || i < word2.length()){
            if( i < word1.length()){
                sb.append(word1.charAt(i));
            }

            if( i < word2.length()){
                sb.append(word2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
}

// Things I Learned:
// ✔ Strings are immutable.
// ✔ StringBuilder is used when repeatedly building a string.
// ✔ Use append() instead of '+' inside loops.
// ✔ One index can traverse two strings.
// ✔ Always check bounds before charAt().