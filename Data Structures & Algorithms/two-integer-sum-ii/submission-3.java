class Solution {
    public int[] twoSum(int[] numbers, int target) {
    int p1 = 0;
    int p2 = numbers.length-1;

    while(p1 < p2){
        int currentSum = numbers[p1]+numbers[p2];
        if(currentSum > target){
            p2--;
            continue;
        }
        if(currentSum < target){
            p1++;
            continue;
        }
        if(target == currentSum){
            break;
        }
    }
    return new int[]{Math.min(p1+1,p2+1),Math.max(p1+1,p2+1)};
  
    }
}
