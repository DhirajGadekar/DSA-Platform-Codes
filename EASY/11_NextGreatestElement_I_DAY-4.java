/*
 * 11] Next Greatest Elment I
 */

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        for(int i = 0; i < nums1.length; i++) {

            int num = -1;
            boolean flag1 = false;
            boolean flag2 = false;
            for(int j = 0; j < nums2.length - 1; j++) {

                if(nums1[i] == nums2[j]) {

                    flag1 = true;
                    flag2 = true;
                }
                if(flag1 && nums1[i] < nums2[j + 1]) {

                    num = nums2[j + 1];
                    flag1 = false;
                }
            }
            if(flag2) {
                nums1[i] = num;
            } else {
                nums1[i] = -1;
            }
        }
        return nums1;
    }
}
