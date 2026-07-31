class FirstUnique {
    Deque<Integer> deque = new ArrayDeque<>();
    HashMap<Integer, Boolean> uniques= new HashMap<>();
    

    public FirstUnique(int[] nums) {
        for(int e : nums){
            add(e);
        }
        
    }
    
    public int showFirstUnique() {
        for(int dequeE : deque){
            for(Map.Entry<Integer,Boolean> uniq : uniques.entrySet()){
                if(dequeE == uniq.getKey() && uniq.getValue()) return dequeE;
            }
        }
    return -1;
        
    }
    
    public void add(int value) {
        deque.addLast(value);
        if(!uniques.containsKey(value)){
            uniques.put(value, true);
        }
        else{
            uniques.put(value, false);
        }
        
    }
}

/**
 * Your FirstUnique object will be instantiated and called as such:
 * FirstUnique obj = new FirstUnique(nums);
 * int param_1 = obj.showFirstUnique();
 * obj.add(value);
 */
