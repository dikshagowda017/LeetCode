class Solution {
    public void reverseString(char[] s) {

        // Initialize two pointers
        int left = 0;
        int right = s.length - 1;

        // Swap characters until the pointers meet
        while (left < right) {

            // Store the left character temporarily
            char temp = s[left];

            // Swap left and right characters
            s[left] = s[right];
            s[right] = temp;

            // Move pointers towards the center
            left++;
            right--;
        }
    }
}