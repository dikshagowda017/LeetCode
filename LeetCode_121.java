/*
===========================================================
LeetCode 121 - Best Time to Buy and Sell Stock
===========================================================

PROBLEM:
You are given an array where prices[i] represents the
stock price on day i.

Choose:
1. One day to buy.
2. A later day to sell.

Find the maximum possible profit.

Only ONE transaction is allowed.

Example:

prices = [7, 1, 5, 3, 6, 4]

Best choice:
Buy at 1
Sell at 6

Profit = 6 - 1 = 5

Output:
5

-----------------------------------------------------------
APPROACH:
Use a Greedy + One Pass approach.

Maintain two variables:

minPrice  -> cheapest price seen so far
maxProfit -> maximum profit found so far

For every price:
1. Check if it is the new minimum price.
2. Calculate profit if we sell today.
3. Update maxProfit if today's profit is better.

-----------------------------------------------------------
IMPORTANT FORMULA:

profit = current price - minimum price

Example:

minPrice = 1
current price = 6

profit = 6 - 1
       = 5

-----------------------------------------------------------
WHY GREEDY?

At every day, we assume we should have bought at the
cheapest price seen before that day.

Then we check:
"If I sell today, what is my profit?"

We keep only the best profit.

-----------------------------------------------------------
TIME COMPLEXITY:
O(n)
We traverse the array only once.

SPACE COMPLEXITY:
O(1)
Only a few variables are used.

PATTERN:
Greedy + One Pass

-----------------------------------------------------------
KEY POINTS TO REMEMBER:

minPrice = cheapest price so far

profit = current price - minPrice

maxProfit = best profit so far

===========================================================
*/

class Solution {
    public int maxProfit(int[] prices) {

        // Store the cheapest stock price seen so far
        int minPrice = prices[0];

        // Store the maximum profit found so far
        int maxProfit = 0;

        // Start from index 1 because prices[0]
        // is already stored as the initial minimum price
        for (int i = 1; i < prices.length; i++) {

            // If today's price is cheaper than the
            // minimum price seen so far, update it
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // Calculate the profit if we sell today
            // after buying at the cheapest price
            int profit = prices[i] - minPrice;

            // If today's profit is better than the
            // previous maximum profit, update it
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        // Return the maximum profit found
        return maxProfit;
    }
}