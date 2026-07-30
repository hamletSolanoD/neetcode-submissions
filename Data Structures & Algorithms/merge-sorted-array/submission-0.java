class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for(int e = m; e < nums1.length; e++){
            nums1[e] = nums2[e-m];
        }

        Arrays.sort(nums1);

        
    }
}