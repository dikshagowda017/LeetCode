class Solution {
    private static final String[] MAP = {
        "", "", "abc", "def", "ghi", "jkl",
        "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return result;
        }

        backtrack(digits, 0, new StringBuilder(), result);
        return result;
    }

    private void backtrack(String digits, int index, StringBuilder current, List<String> result) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = MAP[digits.charAt(index) - '0'];

        for (char c : letters.toCharArray()) {
            current.append(c);
            backtrack(digits, index + 1, current, result);
            current.deleteCharAt(current.length() - 1);
        }
    }
}

// Problem:
// Given a string containing digits from 2 to 9, return all possible letter
// combinations that the number could represent using a phone keypad.

// Approach:
// 1. Create a mapping of digits to their corresponding letters.
// 2. Use backtracking to generate all possible combinations.
// 3. Append one letter at a time and move to the next digit.
// 4. Once all digits are processed, add the combination to the result.

// Time Complexity: O(4^n * n)
// Space Complexity: O(n)