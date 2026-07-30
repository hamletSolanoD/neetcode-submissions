class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        //a = 97
        //z = 122

        //011
        //011
        
        
        HashMap<String,List<String>> patternOfSequence = new HashMap<>();

        for(String s : strings){
            char last = s.charAt(0);
            StringBuilder newKey = new StringBuilder("");
            for(int  e = 0; e < s.length(); e ++){
                char actual = s.charAt(e);
                int diff  = actual-last;
                diff = diff< 0? 26+diff : diff;
                System.out.println("actual"+actual+" last"+last +" "+ diff);
                newKey.append((diff)+"-");
                last  = actual;
            }
            List<String> existingList = patternOfSequence.getOrDefault(newKey.toString(),new ArrayList<String>());
            existingList.add(s);
                System.out.println(newKey.toString());
            patternOfSequence.put(newKey.toString(),existingList);
        }

        return new ArrayList(patternOfSequence.values());
        
    }
}
