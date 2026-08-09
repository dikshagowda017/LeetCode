/*
===========================================================
LeetCode 13 - Roman to Integer
===========================================================

PROBLEM:
Given a Roman numeral string, convert it into an integer.

Roman numeral values:
I = 1
V = 5
X = 10
L = 50
C = 100
D = 500
M = 1000

Normally, Roman values are added.

Example:
VI = 5 + 1 = 6

But if a smaller value comes before a larger value,
we subtract the smaller value.

Example:
IV = 5 - 1 = 4
IX = 10 - 1 = 9

-----------------------------------------------------------
APPROACH:
1. Store Roman symbols and their values in a HashMap.
2. Traverse the string from left to right.
3. Get the current character's value.
4. Compare the current value with the next value.
5. If current < next, subtract current.
6. Otherwise, add current.
7. Return the final result.

-----------------------------------------------------------
IMPORTANT LOGIC:

Current < Next  -> SUBTRACT
Current >= Next -> ADD

Example:
MCMXCIV

1000 - 100 + 1000 - 10 + 100 - 1 + 5
= 1994

-----------------------------------------------------------
TIME COMPLEXITY:
O(n)
We traverse the Roman numeral once.

SPACE COMPLEXITY:
O(1)
The HashMap contains only 7 fixed Roman symbols,
so its size does not depend on input size.

PATTERN:
HashMap + One Pass

===========================================================
*/

import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {

        // Store each Roman symbol and its integer value
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        // Stores the final answer
        int result = 0;

        // Traverse the string from left to right
        for (int i = 0; i < s.length(); i++) {

            // Get the value of the current Roman character
            int current = map.get(s.charAt(i));

            // Check if a next character exists
            // and whether current value is smaller than next value
            if (i + 1 < s.length() &&
                current < map.get(s.charAt(i + 1))) {

                // Smaller value before larger value -> subtract
                result -= current;

            } else {

                // Otherwise -> add
                result += current;
            }
        }

        // Return the final integer value
        return result;
    }
}