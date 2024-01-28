/* *
 * 40] Intersection of Two Arrays
 */

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums1.length; i++) {

            map.put(nums1[i], 0);
        }
        HashMap<Integer, Integer> ansmap = new HashMap<>();
        for(int i = 0; i < nums2.length; i++) {

            if(map.containsKey(nums2[i])) {

                ansmap.put(nums2[i], 0);
            }
        }
        int i = 0;
        int ans[] = new int[ansmap.size()];
        for(Integer e : ansmap.keySet()) {

            ans[i] = e;
            i++;
        }
        return ans;
    }
}
