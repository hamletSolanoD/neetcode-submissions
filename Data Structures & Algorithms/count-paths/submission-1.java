class Solution {
    HashMap<String,Integer> CurrentPositionAndPossiblePaths = new HashMap<>(); 
    public int uniquePaths(int m, int n) {
        return dp(m,n, 0,0);
    }
    public int dp(int maxM, int maxN, int currentM, int currentN){
        if(currentM >= maxM || currentN >= maxN ) return 0;
        if( currentM == maxM-1 && currentN == maxN-1) return 1;

        String key = currentM+","+currentN;
        if(CurrentPositionAndPossiblePaths.get(key) != null) return  CurrentPositionAndPossiblePaths.get(key);
        int down = dp(maxM,maxN,currentM+1,currentN); 
        int rigth = dp(maxM,maxN,currentM,currentN+1);
        int result = down +  rigth;
        CurrentPositionAndPossiblePaths.put(key, result);
        return result; 
    }
}
