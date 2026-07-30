class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer> numbers = new HashMap<>();
      
      for(int e : nums){
        numbers.put(e, numbers.getOrDefault(e,0)+1);
      }
    int value1 = -1;
    int value2 = -1;
      for(int e : nums){
        int remaining = target - e;
        if(numbers.containsKey(remaining)){
            if(remaining == e && numbers.get(e)> 1){
                value1 = e;
                value2 = e;
                break;
            }
            else{
                value1 = remaining;
                value2 = e;
            }
        }
      }
    int pointer1 = -1,pointer2 = -1;   
      for(int e = 0; e < nums.length; e++){
        if(nums[e] == value1 && pointer1 == -1){  
        pointer1=e;
        continue;
        }
        if(nums[e] == value2 && pointer2 == -1){
            pointer2=e;
            continue;
        }
      }
      int[] answer = new int[]{pointer1,pointer2};
      Arrays.sort(answer);
return answer; 
    }
}
