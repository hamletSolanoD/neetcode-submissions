class FirstUnique {
    LinkedHashSet<Integer> linkHashSet = new LinkedHashSet<>();
    HashMap<Integer, Boolean> uniques= new HashMap<>();
    

    public FirstUnique(int[] nums) {
        for(int e : nums){
            add(e);
        }
        
    }
    
    public int showFirstUnique() {
     if(! linkHashSet.isEmpty()) return linkHashSet.getFirst();
    return -1;
        
    }
    
    public void add(int value) {
        linkHashSet.add(value);
        if(!uniques.containsKey(value)){
            uniques.put(value, true);
        }
        else{
            uniques.put(value, false);
            linkHashSet.remove(value);
        }
        
    }
}

/**
 * Your FirstUnique object will be instantiated and called as such:
 * FirstUnique obj = new FirstUnique(nums);
 * int param_1 = obj.showFirstUnique();
 * obj.add(value);
 */
