// Best Time to Buy and Sell Stock III 

public class Solution {
    public int maxProfit(int[] prices) {
    	if (prices == null || prices.length == 0) return 0;
        int profit = 0;
        int len = prices.length;
        int[] left = new int[len];
        int[] right = new int[len];

        //from left to right
        left[0] = 0;
        int mini = prices[0];
        for (int i = 1; i < len; i++) {
            mini = Math.min(mini, prices[i]);
            left[i] = Math.max(left[i-1], prices[i] - mini);
        }           

        //from right to left
        right[len-1] = 0;
        int maxi = prices[len-1];
        for (int i = len - 2; i >= 0; i--) {
            maxi = Math.max(maxi, prices[i]);
            right[i] = Math.max(right[i+1], maxi - prices[i]);
        }

        for (int i = 0; i < len; i++) {
            profit = Math.max(left[i]+right[i], profit);
        }
        return profit;
    }
}