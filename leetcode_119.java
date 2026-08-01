class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();

        row.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            for (int j = i - 1; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
            row.add(1);
        }

        return row;
    }
}
// Problem:
// Given an integer rowIndex, return the rowIndex-th (0-indexed)
// row of Pascal's Triangle.

// Approach:
// 1. Start with the first row [1].
// 2. Build each next row in-place.
// 3. Update elements from right to left to avoid overwriting values.
// 4. Append 1 at the end of each row.
// 5. Return the required row.

// Time Complexity: O(n²)
// Space Complexity: O(n)