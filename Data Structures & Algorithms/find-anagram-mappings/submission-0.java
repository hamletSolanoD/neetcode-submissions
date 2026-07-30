class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> mappingsOfSecond = new HashMap<>();
        for(int n = 0; n < nums2.length; n++ ) {
            mappingsOfSecond.put(nums2[n],n);
        }
        int[] mapaResult = new int[nums1.length];

        for(int n = 0; n <nums1.length; n++ ) {
            mapaResult[n] = mappingsOfSecond.get(nums1[n]);
        }
        return mapaResult;
    }
}
