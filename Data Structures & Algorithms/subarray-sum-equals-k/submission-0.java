
/// since i have negative values i cannot use slading window, i need to use brute force optmized with sum of prefix
class Solution {

    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> sumOfPrefix = new HashMap<>(); 
        sumOfPrefix.put(0,1);
        int currentSum = 0;
        int result = 0;
        for(int e : nums){
            currentSum += e;
            int diff = currentSum - k;
            result += sumOfPrefix.getOrDefault(diff,0);
            sumOfPrefix.put(currentSum,sumOfPrefix.getOrDefault(currentSum,0)+1);
        }
     return result;
    }
}