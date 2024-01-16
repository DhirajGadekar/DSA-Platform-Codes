/*
 * 2] Remove Element
 */

class Solution {
    public int removeElement(int[] nums, int val) {

        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {

            if(nums[i] != val) {

                al.add(nums[i]);
            }
            nums[i] = 0;
        }

        Iterator<Integer> it = al.iterator();
        int i = 0;
        while(it.hasNext()) {

            nums[i] = (int)it.next();
            i++;
        }
        return al.size();
    }
}
