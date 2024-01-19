/*
 * 13] Find Pivot Index
 */

class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length == 1) {

            return 0;
        }
        int prefix[] = new int[nums.length];
        int suffix[] = new int[nums.length];
        prefix[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {

            prefix[i] = prefix[i - 1] + nums[i];
        }
        suffix[nums.length - 1] = nums[nums.length - 1];
        for(int i = nums.length -2; i >= 0; i--) {

            suffix[i] = nums[i] + suffix[i + 1];
        }
        if(suffix[1] == 0) {

            return 0;
        }
        for(int i = 1; i < nums.length - 1; i++) {
            if(prefix[i - 1] == suffix[i + 1]) {

                return i;
            }
        }
        if(prefix[nums.length - 2] == 0) {

            return nums.length - 1;
        }
        return -1;
    }
}
