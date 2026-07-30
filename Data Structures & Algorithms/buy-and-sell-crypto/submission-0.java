class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit  = 0;
        int minBuy = prices[0];

        for(int e: prices){
            maxprofit = Math.max(maxprofit, e - minBuy);
            minBuy = Math.min(minBuy, e);
        }
return maxprofit;
        
    }
}
