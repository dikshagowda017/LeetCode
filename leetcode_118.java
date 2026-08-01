class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }

            result.add(row);
        }

        return result;
    }
}

// Problem:
// Given an integer numRows, return the first numRows of Pascal's Triangle.

// Approach:
// 1. Create an empty list to store all rows.
// 2. For each row:
//    - First and last elements are always 1.
//    - Middle elements are the sum of the two elements
//      directly above from the previous row.
// 3. Add each completed row to the result.

// Time Complexity: O(n²)
// Space Complexity: O(n²)