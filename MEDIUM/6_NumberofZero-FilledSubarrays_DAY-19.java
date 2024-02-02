/* *
 * 6] Number of Zero-Filled Subarrays
 */

class Solution {
    public long zeroFilledSubarray(int[] nums) {
        
	int i = 0;
        long count = 0;
        long ans = 0;
        
        while(i != nums.length){

            if(nums[i] == 0){
                count++;
                i++;
                continue;
            } else{

                if(count != 0){
                    ans += (count*(count+1))/2;
                }
                count = 0;
            }
            i++;
        }
        if(count != 0){
            ans += (count*(count+1))/2;
        }
        return ans;
    }
}
