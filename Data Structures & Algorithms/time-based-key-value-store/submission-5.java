class TimeMap {

    HashMap<String, ArrayList<entryValues>> nameTimeValue = new HashMap<>();    
    class entryValues{
        int time;
        String value;
        public entryValues(int ti,String val){
            this.time = ti;
            this.value = val;
        }
    }
    public TimeMap() {
        
    }
    
    public void set(String key, String value, int timestamp) {
        ArrayList<entryValues> setOfTimeStaps = nameTimeValue.getOrDefault(key,new ArrayList<>());
        setOfTimeStaps.add(new entryValues(timestamp,value));
        nameTimeValue.put(key,setOfTimeStaps);
        
    }
    
    public String get(String key, int timestamp) {
        ArrayList<entryValues> setOfTimeStaps = nameTimeValue.get(key);
        if(setOfTimeStaps == null) return "";
        int l = 0 ;
        int r = setOfTimeStaps.size()-1;
        int bestMatch = Integer.MIN_VALUE;
        String result = "";
        while(l <= r){
            int midd = l + ((r-l)/2);
            int entryStaps = setOfTimeStaps.get(midd).time;
            if(entryStaps < timestamp){
                if(entryStaps > bestMatch ){
                    bestMatch = entryStaps;   
                    result = setOfTimeStaps.get(midd).value;          
                }
                l = midd+1;
            }
            else if(entryStaps > timestamp){
                r = midd-1;
            }
            else {
                return setOfTimeStaps.get(midd).value;
            }
        }
        return result;
    }
}
