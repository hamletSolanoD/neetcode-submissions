class Solution {
    public class Number implements Comparable<Number>{
        int Value;
        int realPointer;
        public Number(int value, int realpoint){
            this.Value = value;
            this.realPointer = realpoint;
        }

        public int compareTo(Number otherNum){
            return Integer.compare(this.Value, otherNum.Value);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        Number numbers[] = new Number[nums.length];
        for(int e = 0; e<nums.length;e++){
            numbers[e] = new Number(nums[e],e);
        }
        Arrays.sort(numbers);
        int pointer1 = 0; 
        int pointer2 = nums.length-1;
        while(pointer1 < pointer2){
            int currSum = numbers[pointer1].Value + numbers[pointer2].Value;
            if(currSum > target){
                pointer2--;
                continue;
            }
            if(currSum < target){
                pointer1++;
                continue;
            }
            if(currSum == target){
               break;
            }
        }
        return new int[]{Math.min(numbers[pointer1].realPointer,numbers[pointer2].realPointer),Math.max(numbers[pointer1].realPointer,numbers[pointer2].realPointer)};

    }
}
