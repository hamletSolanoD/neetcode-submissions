class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, ArrayList<Integer> > duplicatedNumbers = new HashMap<>();
        boolean notCorrectDuplicate = false;
        for(int e = 0; e < nums.length; e++){
            duplicatedNumbers.putIfAbsent(nums[e], new ArrayList<Integer>());
            duplicatedNumbers.get(nums[e]).add(e);
        }

        for(Map.Entry<Integer, ArrayList<Integer>> entry : duplicatedNumbers.entrySet()){
            if(entry.getValue().size() == 1) continue;
            boolean isLocalCorrect = false;
            int l = 0;
            int r = entry.getValue().size()-1;
            Collections.sort(entry.getValue());
            while(l <= r){
                if(l == r){
                    l++;
                    r = entry.getValue().size()-1;
                    continue;
                }
                int absValue = Math.abs(entry.getValue().get(r) - entry.getValue().get(l))  ;
                if(absValue > k){
                    r--;
                    System.out.println(absValue);
                }
                else{
                   isLocalCorrect = true;
                   break; 
                }
            }
        
            notCorrectDuplicate =  isLocalCorrect;
        }


  
        return notCorrectDuplicate;

        
    }
}