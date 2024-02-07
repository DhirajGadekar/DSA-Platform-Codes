/* *
 * 15] Maximum Subarray
 */

class Solution {
    public int maxSubArray(int[] nums) {
        int curr = 0;
        int max = nums[0];
        for(int i = 0; i < nums.length; i++) {
            curr += nums[i];
            max = curr > max ? curr : max;
            if(curr < 0) {
                curr = 0;
            }
        }
        return max;
    }
}
