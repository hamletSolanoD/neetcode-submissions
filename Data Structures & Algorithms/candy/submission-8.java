class Solution {
    public int candy(int[] ratings) {
        int CandyArray[] = new int[ratings.length];
        for(int e = 0; e < ratings.length; e++){
            CandyArray[e] = 1;
        }
       for(int e = 1; e < ratings.length; e++){
            if(ratings[e] > ratings[e-1]){
                CandyArray[e] = CandyArray[e-1]+1;
            }
        }

           for(int e = ratings.length-2; e >= 0; e--){
            if(ratings[e] > ratings[e+1]){
                if(  CandyArray[e] <= CandyArray[e+1]){
                CandyArray[e] = CandyArray[e+1]+1;
                }
            }
        }
        int answer = 0;
        for(int e : CandyArray){
            answer += e;
        }


        return answer;
        
    }
}