class Solution {
    public int smallestNumber(int n, int t) {
        while (true) {
            int product = 1;
            int x = n;

            while (x > 0) {
                product *= (x % 10);
                x /= 10;
            }

            if (product % t == 0) {
                return n;
            }

            n++;
        }
    }
}

// Problem:
// Find the smallest integer greater than or equal to n such that
// the product of its digits is divisible by t.

// Approach:
// 1. Start checking from n.
// 2. Calculate the product of the digits.
// 3. If the product is divisible by t, return the number.
// 4. Otherwise, increment n and repeat the process.

// Time Complexity: O(k * d)
// (k = numbers checked, d = number of digits)
// Space Complexity: O(1)