/* *
 * 34] Move Zeros
 */

class Solution {
    public void moveZeroes(int[] nums) {

        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {

            if(nums[i] != 0) {

                al.add(nums[i]);
            }
        }
        for(int i = 0; i < nums.length; i++) {

            if(i < al.size()) {

                nums[i] = al.get(i);
            } else {

                nums[i] = 0;
            }
        }
    }
}
