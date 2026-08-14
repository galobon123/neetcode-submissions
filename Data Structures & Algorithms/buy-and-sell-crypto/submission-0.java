class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int profit;
        int bestP = 0;

        for(int i = 1; i < prices.length; i++){
            profit = prices[i] - prices[l];

            if(profit > bestP)
                bestP = profit;
            
            if(prices[l] > prices[i])
                l = i;

        }

        return bestP;
    }
}
