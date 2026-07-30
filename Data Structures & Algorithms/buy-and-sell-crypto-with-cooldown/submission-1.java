class Solution {
    HashMap<String, Integer> postionProfit = new HashMap<>(); 
    public int maxProfit(int[] prices) {
        
        return dp(0, "buy", prices);
    }

    public int dp(int position, String scenario, int prices[]){
        if(position >= prices.length) return 0;
        int profit1 = 0;
        int profit2 = 0;      
        switch(scenario){
            case "buy":
             profit1 = postionProfit.getOrDefault((position+1)+"sell",dp(position +1, "sell", prices) - prices[position]);
             profit2 = postionProfit.getOrDefault((position+1)+"buy",dp(position+1,"buy",prices));            
            break;
            case "sell":
             profit1 =  postionProfit.getOrDefault((position+2)+"buy",dp(position+2,"buy",prices) + prices[position]);
             profit2 =   postionProfit.getOrDefault((position+1)+"sell",dp(position+1,"sell",prices));
             break;
        }
        int bestOption = Math.max(profit1,profit2);
        postionProfit.put(position+"scenario",bestOption);

        return bestOption;
    }
}
