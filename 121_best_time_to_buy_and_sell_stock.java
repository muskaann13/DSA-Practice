class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int max_profit = 0;
        int cp = Integer.MAX_VALUE;

        for (int i=0; i<prices.length; i++) {
            if (cp < prices[i]) {
                profit = prices[i] - cp;
                max_profit = Math.max(max_profit, profit);
            } else {
                cp = prices[i];
            }
        }
        return max_profit;
    }
}