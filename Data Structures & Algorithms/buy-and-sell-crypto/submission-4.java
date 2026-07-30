class Solution {
    public int maxProfit(int[] prices) {
    int bestProfit = 0;
    int bestbuy= prices[0];

    for(int e : prices){
        
        bestbuy = Math.min(e,bestbuy);
        bestProfit = Math.max(bestProfit, e-bestbuy);
    }
    return bestProfit;
    }
}
