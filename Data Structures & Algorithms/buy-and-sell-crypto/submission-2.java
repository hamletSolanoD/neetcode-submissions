class Solution {
    public int maxProfit(int[] prices) {
int maxProfit =0;
int bestBuyIndex = 0;
    for(int e =0;e < prices.length;e ++){
        if(prices[bestBuyIndex] > prices[e]){
            bestBuyIndex = e;
        }
        maxProfit = Math.max(prices[e]-prices[bestBuyIndex],maxProfit);
    }
    return maxProfit;
    }
}
