class Solution {
    public int maxProfit(int[] prices) {
        int accoumulatedProfit = 0;
        for(int e = 1; e < prices.length; e++){
            if(prices[e] > prices[e-1]){
                accoumulatedProfit += prices[e]-prices[e-1];
            }
        }
        return accoumulatedProfit;
    }
}