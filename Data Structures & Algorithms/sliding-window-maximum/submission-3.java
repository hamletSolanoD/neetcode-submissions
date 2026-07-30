class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> sliding = new ArrayDeque<>();
        int l = 0;
        int r = 0;
        int ans[] = new int[nums.length - k + 1];
        while (r < nums.length){
            if(r-l < k) {
                addToDeque(sliding,nums[r]);
                if(r-l == k-1){
                    ans[l] = sliding.peekFirst();
                }
            }
            else {
                if(sliding.peekFirst() == nums[l]){
                    sliding.pollFirst();
                }
                l++;
                addToDeque(sliding, nums[r]);  
                ans[l] = sliding.peekFirst();
            }
            r++;
        }
       return ans;
    }    
    public void addToDeque(Deque<Integer> deq, int numToAdd){
        while(deq.peekLast() != null && deq.peekLast() < numToAdd){
            deq.pollLast();
        }
        deq.addLast(numToAdd);
    }
}
