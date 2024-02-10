/* *
 * 21] Maximum Product Subarray
 */

class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int pref = 1;
        int suff = 1;
        for(int i = 0; i < nums.length; i++){
            pref *= nums[i];
            max = Math.max(max, pref);
            if(pref == 0) pref = 1;
        }

        for(int i = nums.length-1; i >= 0; i--){
            suff *= nums[i];
            max = Math.max(max, suff);
            if(suff == 0) suff = 1;
        }
        return max;
    }
}
