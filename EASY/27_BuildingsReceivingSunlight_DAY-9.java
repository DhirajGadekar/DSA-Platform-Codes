/*
 * 27] Buildings receiving sunlight
 */

class Solution {

    public static int longest(int arr[],int n) {

        int max = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0; i < n; i++) {

            if(max <= arr[i]) {

                count++;
                max = arr[i];
            }
        }
        return count;
    }
}
