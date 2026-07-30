class Solution {
    public int maxProfit(int[] prices) {
        
        return dp(0, "buy", prices);
    }

    public int dp(int position, String scenario, int prices[]){
        if(position >= prices.length) return 0;
        switch(scenario){
            case "buy":
            int profit1 = dp(position +1, "sell", prices) - prices[position];
            int profit2 = dp(position+1,"buy",prices);
            return Math.max(profit1,profit2);
            case "sell":
            int profit3 = dp(position+2,"buy",prices) + prices[position];
            int profit4 = dp(position+1,"sell",prices);
            return Math.max(profit3,profit4);
        }
        return 0;
    }
}
