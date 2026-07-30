class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
      
        for(int e = 0; e < numRows;e++){
            List<Integer>  currentList = new ArrayList<Integer>();
            if(e == 0){
                currentList.add(1);
            }else{
                List<Integer> tmp = new ArrayList<Integer>();
                tmp.addAll(res.get(e-1));
                tmp.add(0,0);
                tmp.add(0);
              for(int colums = 1; colums < e+2; colums++){
                int val = tmp.get(colums)+ tmp.get(colums-1);
                currentList.add(val);
            }   
            }
            res.add(currentList);
        }
        return res;
        
    }
}