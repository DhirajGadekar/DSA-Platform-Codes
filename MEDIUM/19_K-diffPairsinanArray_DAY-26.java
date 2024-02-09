/* *
 * 19] K-diff Pairs in an Array 
 */

class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int p : map.keySet()){
            if(k == 0 && map.get(p) > 1){
                count++;
            }
            else if(k > 0 && map.containsKey(p + k)){
                count++;
            }
        }
        return count;
    }
}
