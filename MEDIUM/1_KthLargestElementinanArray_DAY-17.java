/* *
 * 1] Kth Largest Element in an Array
 */

class Solution {
    public int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
