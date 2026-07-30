class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // keep track of current number
        //keep track of maximum recurrence
    int maxOcc = 0;
    int currOcc = 0;
         for(int e: nums)
        {
            if(e == 0 ){
             currOcc = 0;   
            }
            else{
                currOcc++;
            }
            maxOcc = Math.max(maxOcc, currOcc);

        }
        return maxOcc;
    }
}