class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int firstPointer = 0;
        int secondPointer = numbers.length-1;
        while(firstPointer < secondPointer){
            int pointersSum = numbers[firstPointer] + numbers[secondPointer];
            if(pointersSum < target) {
                firstPointer++;
                continue;
            }
            if(pointersSum > target){
                secondPointer--;
                continue;
            }
            else break;
        }
        return new int[]{firstPointer+1,secondPointer+1};
        

  
    }
}
