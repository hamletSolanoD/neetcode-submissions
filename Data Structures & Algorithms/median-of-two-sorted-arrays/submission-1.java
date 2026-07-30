class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        int l = 0;
        int r = nums1.length;
        while(l <= r){
            int midd = l + ((r-l)/2);
            int mid2 = ((nums1.length+nums2.length+1)/2)-midd;

            int maxLeft1 = (midd == 0) ? Integer.MIN_VALUE: nums1[midd-1];
            int minRigth1 = (midd >= nums1.length) ? Integer.MAX_VALUE: nums1[midd];

            int maxLeft2 = (mid2 == 0) ? Integer.MIN_VALUE : nums2[mid2-1];
            int minRight2 = (mid2 >= nums2.length)? Integer.MAX_VALUE : nums2[mid2];


            if(maxLeft1 <= minRight2 && maxLeft2 <= minRigth1){
                boolean isPair = (nums1.length+nums2.length)%2 == 0;
                if(isPair){
                    return (Math.max(maxLeft1,maxLeft2) + Math.min(minRigth1,minRight2))/2.0;
                }
                else{
                    return Math.max(maxLeft1,maxLeft2);
                }
            }
            else if(maxLeft1 > minRight2){
                r = midd-1;
            } 
            else{
                l = midd+1;
            }
        } 
        return 0;
        
    }
}
