/*
 * 25] Missing Number
 */

class Solution {
    public int missingNumber(int[] nums) {

        int itr = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {

            if(nums[i] != itr) {

                return itr;
            }
            itr++;
        }
        return itr;
    }
}
