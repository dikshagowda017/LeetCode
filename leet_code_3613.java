class Solution {
    public int uniqueXorTriplets(int[] nums) {

        // Length of the permutation array
        int n = nums.length;

        // If there are only 1 or 2 elements,
        // the unique XOR values are simply the elements themselves.
        if (n <= 2) {
            return n;
        }

        // Find the number of bits required to represent n.
        // Example:
        // n = 3  -> bits = 2
        // n = 5  -> bits = 3
        // n = 10 -> bits = 4
        int bits = 32 - Integer.numberOfLeadingZeros(n);

        // The answer is 2^bits.
        // Example:
        // bits = 2 -> 4
        // bits = 3 -> 8
        // bits = 4 -> 16
        return 1 << bits;
    }
}