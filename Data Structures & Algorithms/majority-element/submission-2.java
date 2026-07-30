class Solution {
    public int majorityElement(int[] nums) {
        int maxNumber = 0;
        int occ = 0;
        for( int e : nums){
            if(occ == 0){
                maxNumber = e;
                occ=1;
            }
            else{
                if(maxNumber == e){
                    occ++;
                }
                else{
                    occ--;
                }

            }
        }
        return maxNumber;
    }
}