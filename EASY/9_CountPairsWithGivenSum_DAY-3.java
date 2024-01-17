/* *
 * 9] Count pairs with given sum
 */

class Solution {
    int getPairsCount(int[] arr, int n, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int count = 0;
        for(int i = 0; i < n; i++) {

            if(map.containsKey(k - arr[i])) {

                int val = map.get(k - arr[i]);
                if((k- arr[i]) == arr[i]) {

                    count = count + val - 1;
                } else {

                    count = count + val;
                }
                //map.replace(k - arr[i], (map.get(k - arr[i]) - 1));
                map.put(arr[i], map.get(arr[i]) - 1);
            }
        }
        return count;
    }
}
