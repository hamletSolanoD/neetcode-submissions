class Solution {
    public int[] replaceElements(int[] arr) {
        HashMap<Integer,Integer> posAndMax = new HashMap<>();
        //inverse iteration
        // in each iteration we will compare wich one is the maximum
        int localMax = -1;
        for(int e = arr.length-1; e >= 0; e--){
            posAndMax.put(e, localMax);
            localMax = Math.max(localMax, arr[e]);
        }
        int ans[] = new int[arr.length];
        for(int e = 0; e < arr.length; e++ ){
            ans[e] = posAndMax.get(e);
        }
        return ans;

    }
}