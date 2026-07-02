class Solution {
    public int myAtoi(String s) {

        // Length of the input string
        // Example: "  -42" -> n = 5
        int n = s.length();

        // Pointer (index) used to travel through the string
        // Think of it as your finger pointing at each character
        int i = 0;

        // Assume the number is positive initially
        // If we later find '-', we'll change it to -1
        int sign = 1;

        // Store the number being built
        // We use long instead of int because the number
        // might become larger than int while building it
        long number = 0;

        // --------------------------------------------------
        // STEP 1 : Skip all leading spaces
        // --------------------------------------------------
        // Example:
        // "    -42"
        // ^
        // Move until we reach '-'
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // --------------------------------------------------
        // STEP 2 : Check whether number is positive or negative
        // --------------------------------------------------
        // Possible cases:
        // "+"
        // "-"
        // "4"
        //
        // If '+' -> keep sign = 1
        // If '-' -> sign = -1
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {

            if (s.charAt(i) == '-') {
                sign = -1;
            }

            // Move to the next character after '+' or '-'
            i++;
        }

        // --------------------------------------------------
        // STEP 3 : Read digits one by one
        // --------------------------------------------------
        // Example:
        // "1234abc"
        //
        // Read:
        // 1
        // 2
        // 3
        // 4
        //
        // Stop when 'a' is reached.
        while (i < n && Character.isDigit(s.charAt(i))) {

            // Convert character into actual integer
            //
            // '7' - '0' = 7
            // '3' - '0' = 3
            int digit = s.charAt(i) - '0';

            // --------------------------------------------------
            // STEP 4 : Overflow Check
            // --------------------------------------------------
            // Maximum integer is:
            //
            // 2147483647
            //
            // Before adding another digit,
            // make sure multiplication by 10
            // will not exceed Integer.MAX_VALUE.
            //
            // Example:
            //
            // Current number = 214748364
            // Next digit = 9
            //
            // New number becomes
            // 2147483649
            //
            // This is larger than Integer.MAX_VALUE.
            //
            // Return the maximum/minimum value immediately.
            if (number > Integer.MAX_VALUE / 10 ||
               (number == Integer.MAX_VALUE / 10 && digit > 7)) {

                // Positive overflow
                if (sign == 1)
                    return Integer.MAX_VALUE;

                // Negative overflow
                else
                    return Integer.MIN_VALUE;
            }

            // --------------------------------------------------
            // STEP 5 : Build the number
            // --------------------------------------------------
            //
            // Formula:
            //
            // number = number * 10 + digit
            //
            // Example:
            //
            // number = 13
            // digit = 7
            //
            // 13 * 10 = 130
            // 130 + 7 = 137
            //
            // Slowly the complete number is formed.
            number = number * 10 + digit;

            // Move to the next character
            i++;
        }

        // --------------------------------------------------
        // STEP 6 : Apply sign
        // --------------------------------------------------
        //
        // Example:
        //
        // number = 42
        //
        // sign = -1
        //
        // answer = -42
        //
        // Convert long back to int because the
        // function must return an integer.
        return (int)(sign * number);
    }
}