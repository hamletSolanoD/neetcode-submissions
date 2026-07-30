class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int r[]  = new int[temperatures.length];
        for(int e =0; e < temperatures.length; e++){
            int finalWormDay = -1;

            for(int i = e+1; i < temperatures.length; i++){
                if(temperatures[i] >  temperatures[e] ){
                    finalWormDay = i;
                    break;
                }
            }
            r[e] = finalWormDay != -1 ?  finalWormDay-e : 0 ;
        } 
        return r;
    }
}
