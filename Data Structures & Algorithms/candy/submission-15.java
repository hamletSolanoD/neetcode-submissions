class Solution {
    public int candy(int[] ratings) {
        int[] candys = new int[ratings.length];
        for(int e = 0; e < candys.length;  e++){
            candys[e] = 1;
        }
        for(int e = 1; e < candys.length; e++){
            if(ratings[e] > ratings[e-1]){
                candys[e] =candys[e-1]+1; 
            }
        }
        for(int e = ratings.length-2; e >= 0;e--){
            if(ratings[e] > ratings[e+1] && candys[e] <= candys[e+1]){
                candys[e] = candys[e+1]+1;
            }
        }
        int finalCount = 0;
        for(int c : candys){
            finalCount += c;
        }
       return finalCount;
    }
}