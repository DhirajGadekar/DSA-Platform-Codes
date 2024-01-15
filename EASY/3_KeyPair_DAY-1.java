/*
 * Code3: Key Pair
 */

class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {

        Arrays.sort(arr);
        int start = 0, end = n - 1;
        while(start < end) {

            int sum = arr[start] + arr[end];
            if(sum == x) {

                return true;
            }
            if(sum > x) {

                end--;
            } else {

                start++;
            }
        }
        return false;
    }
}
