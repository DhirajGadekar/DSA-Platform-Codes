/*
 * 10] Max Consecutive Ones
 */

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int max = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++) {

            if(1 == nums[i]) {

                count++;
            } else {

                //i--;
                if(max < count) {

                    max = count;
                }
                count = 0;
            }
        }
        if(max < count) {

            max = count;
        }
        return max;
    }
}
