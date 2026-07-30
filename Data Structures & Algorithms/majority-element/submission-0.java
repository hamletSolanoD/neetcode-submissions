class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> occ = new HashMap<>();
        int maxValue = 0;
        int maxOcc = 0;
        for(int e : nums){
            occ.putIfAbsent(e, 0);
            occ.put(e, occ.get(e)+1);
            if(maxOcc < occ.get(e)){
                maxOcc = occ.get(e);
                maxValue = e;
            }
        }
        return maxValue;
    }
}