class Solution {
    HashMap<Integer, Integer> occurences = new HashMap<>();// hashmap for occurences of numbers with its solutions
    public int climbStairs(int n) {
        return dfs(0,n);
    }
    public int dfs(int entry, int goal){
        if(occurences.containsKey(entry)) return occurences.get(entry);
        int totalFound = 0;
        int val1 = entry+1;
        int val2 = entry+2;

        if(val1 < goal){
            totalFound += dfs(val1,goal); 
        }
        if(val2 < goal){
            totalFound +=  dfs(val2,goal); 
        }
        if(val1 == goal) totalFound+=1;
        if(val2 == goal) totalFound+=1;
        occurences.put(entry, totalFound);

        return totalFound;
    }
    
}
