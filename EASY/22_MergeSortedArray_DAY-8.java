/*
 * 8] Merge Sorted Array
 */

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int itr = 0;

        for(int i = 0; i < nums1.length; i++) {

            if(nums1[i] == 0 && itr < n) {

                nums1[i] = nums2[itr];
                itr++;
            }
        }
        Arrays.sort(nums1);
    }
}
