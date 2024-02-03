/* *
 * 7] Find All Duplicates in an Array
 */

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> e : map.entrySet()) {

            if(e.getValue() > 1) {

                list.add(e.getKey());
            }
        }
        return list;
    }
}
