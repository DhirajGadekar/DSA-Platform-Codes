/* *
 * 7] Majority Element :
 */

class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int max = 0;
        int ele = 0;
        for(Map.Entry<Integer, Integer> e : map.entrySet()) {

            if(max < e.getValue()) {

                max = e.getValue();
                ele = e.getKey();
            }
        }
        return ele;
    }
}
