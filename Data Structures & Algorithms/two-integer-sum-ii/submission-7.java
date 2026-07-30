class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length-1;
        while(l<r){
            int currentSum = numbers[l]+numbers[r];
            if( currentSum < target){
                l++;
            }
           else if(currentSum > target){
                r--;
            }
            else{
                break;
            }
        }
        return new int[]{l+1,r+1};


    }
}