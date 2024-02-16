/* *
 * 33] Subarray Sums Divisible by K
 */

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> prefixSum = new HashMap<>();
        int ans=0,currPrefix=0;
        prefixSum.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            currPrefix = (currPrefix + nums[i] % k + k) % k;
            ans+=prefixSum.getOrDefault(currPrefix,0);
            prefixSum.put(currPrefix%k,prefixSum.getOrDefault(currPrefix,0)+1);
        }
        return ans;
    }
}
