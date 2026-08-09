/*
===========================================================
LeetCode 392 - Is Subsequence
===========================================================

PROBLEM:
Given two strings s and t, determine whether s is a
subsequence of t.

A subsequence means:
- Characters must appear in the same order.
- Characters do NOT have to be next to each other.
- We cannot change the order.

Example:

s = "abc"
t = "ahbgdc"

We can find:
a -> b -> c

Therefore:
Output = true

Example:

s = "axc"
t = "ahbgdc"

There is no 'x' in t.

Therefore:
Output = false

-----------------------------------------------------------
APPROACH:
Use two pointers.

i -> points to the current character we need from s.
j -> moves through every character of t.

Steps:
1. Start i = 0.
2. Traverse t using j.
3. If s[i] == t[j], we found the required character.
4. Move i to the next character.
5. j always moves forward.
6. At the end, check whether i reached s.length().

-----------------------------------------------------------
IMPORTANT LOGIC:

i -> What I need from s
j -> Where I am searching in t

Match -> i++
Always -> j++

If i == s.length()
then all characters of s were found.

-----------------------------------------------------------
RETURN STATEMENT:

return i == s.length();

This checks whether we found ALL characters of s.

If:
i = s.length()
-> true

Otherwise:
-> false

-----------------------------------------------------------
TIME COMPLEXITY:
O(n)
We traverse string t only once.

SPACE COMPLEXITY:
O(1)
Only two pointer variables are used.

PATTERN:
Two Pointers

===========================================================
*/

class Solution {
    public boolean isSubsequence(String s, String t) {

        // i points to the character we currently need from s
        int i = 0;

        // j moves through every character of t
        for (int j = 0; j < t.length(); j++) {

            // Check if characters are available in s
            // and if the current characters match
            if (i < s.length() &&
                s.charAt(i) == t.charAt(j)) {

                // Character found
                // Move to the next character of s
                i++;
            }
        }

        // Check whether all characters of s were found
        return i == s.length();
    }
}