class Solution {
    public long findKthSmallest(int[] coins, int k) {

        long left = 1;
        long right = (long) coins[0] * k;

        while (left < right) {

            long mid = left + (right - left) / 2;

            if (count(mid, coins) >= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private long count(long x, int[] coins) {

        long total = 0;
        int n = coins.length;

        for (int mask = 1; mask < (1 << n); mask++) {

            long lcm = 1;
            int bits = 0;
            boolean valid = true;

            for (int i = 0; i < n; i++) {

                if ((mask & (1 << i)) != 0) {

                    bits++;

                    lcm = lcm(lcm, coins[i]);

                    if (lcm > x) {
                        valid = false;
                        break;
                    }
                }
            }

            if (!valid) {
                continue;
            }

            long value = x / lcm;

            if (bits % 2 == 1) {
                total += value;
            } else {
                total -= value;
            }
        }

        return total;
    }

    private long gcd(long a, long b) {

        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }

    private long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }
}

// Problem:
// Find the kth smallest positive amount that is divisible by at least
// one of the given coin denominations.

// Approach:
// 1. Binary search for the answer.
// 2. For each possible value x, count how many valid amounts are <= x.
// 3. Use inclusion-exclusion to avoid counting overlapping multiples twice.
// 4. Use LCM to find numbers divisible by multiple coins.
// 5. If count(x) >= k, search the left half.
// 6. Otherwise, search the right half.

// Pattern Learned:
// • Binary Search on Answer
// • Inclusion-Exclusion
// • GCD / LCM
// • Bitmasking

// Things I Learned:
// • x / coin gives the number of multiples of coin <= x.
// • LCM helps find numbers divisible by multiple coins.
// • Inclusion-exclusion adds odd-sized combinations and subtracts even-sized combinations.
// • Binary search finds the smallest x having at least k valid amounts.

// Time Complexity: O(2^n * n * log(k * min(coins)))
// Space Complexity: O(1)