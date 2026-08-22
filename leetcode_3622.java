class Solution {
    public boolean checkDivisibility(int n) {

        int sum = 0;
        int product = 1;

        int x = n;

        while (x != 0) {

            int digit = x % 10;

            sum += digit;
            product *= digit;

            x /= 10;
        }

        return n % (sum + product) == 0;
    }
}

// Problem:
// Check whether n is divisible by the sum of its digit sum
// and digit product.

// Approach:
// 1. Extract each digit using % 10.
// 2. Calculate the sum of all digits.
// 3. Calculate the product of all digits.
// 4. Check whether n is divisible by (sum + product).

// Time Complexity: O(log n)
// Space Complexity: O(1)